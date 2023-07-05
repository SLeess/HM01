package br.unimontes.hm01.controller;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteControl implements Control<Cliente>{
    private final Connection conn;

    public ClienteControl() throws SQLException {
        conn = BD.getInstancia().getConnection();
    }
    
    public static ClienteControl clientes() throws SQLException{
        return new ClienteControl();
    }
    
    @Override
    public int save(Cliente entidade) throws DAOException {
       int linhasGravadas = 0;

        try {           
            String iQuery = "INSERT INTO cliente (idCliente, nome, sobrenome, email, telefone) VALUES (null,?,?,?,?)";
            
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getSobrenome());
            st.setString(3, entidade.getEmail());
            st.setString(4, entidade.getTelefone());
           
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entidade);
            }
            else throw new DAOException("Erro ao tentar gravar entidade Aluno. SQLSTATE: "+ex.getSQLState());
        }
        
        
        return linhasGravadas;
    }

    @Override
    public int update(Cliente entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try{
            String uQuery = "UPDATE alunos SET nome = ?, sobrenome = ?, email = ?, telefone = ? WHERE idCliente = ?";
            
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getSobrenome());
            st.setString(3, entidade.getEmail());
            st.setString(4, entidade.getTelefone());
            
            linhasAfetadas = st.executeUpdate();
                        
        } catch(SQLException ex){
            throw new DAOException("Erro ao tentar atualizar entidade Aluno. SQLSTATE: "+ex.getSQLState());
        }
        
        return linhasAfetadas;
    }

    @Override
    public int delete(Cliente entidade) throws DAOException {
        int linhasAfetadas=0;
        try{
            String uQuery = "DELETE FROM alunos WHERE idCliente = ?";
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setInt(1, entidade.getIdCliente());
            
            linhasAfetadas = st.executeUpdate();
        }catch(SQLException ex){
            throw new DAOException("Erro ao tentar apagar Aluno. SQLSTATE: "+ex.getSQLState());
        }
        return 0;
    }

    @Override
    public List<Cliente> findAll() throws DAOException {
        List<Cliente> clientes = new ArrayList<>();
    
        try {
            String query = "SELECT * FROM alunos";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Cliente cliente;
                cliente = new Cliente(rs.getInt("idCliente"), rs.getString("nome"),rs.getString("sobrenome"),rs.getString("telefone"),rs.getString("email"));

                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar listar Alunos. SQLSTATE: " + ex.getSQLState());
        }

        return clientes;
    }

    @Override
    public Cliente findOne(Cliente entidade) throws DAOException {
       Cliente cliente = null;
       try {
           String query = "SELECT * FROM alunos WHERE idCliente = ?";
           PreparedStatement st = conn.prepareStatement(query);
           st.setInt(1, entidade.getIdCliente());
           ResultSet rs = st.executeQuery();

           if (rs.next()) {
               cliente = new Cliente(rs.getInt("idCliente"), rs.getString("nome"),rs.getString("sobrenome"),rs.getString("telefone"),rs.getString("email"));
           }
       } catch (SQLException ex) {
           throw new DAOException("Erro ao tentar encontrar Aluno. SQLSTATE: " + ex.getSQLState());
       }

       return cliente;
    }
}
