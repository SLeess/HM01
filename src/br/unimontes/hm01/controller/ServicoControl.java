package br.unimontes.hm01.controller;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.model.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicoControl implements Control<Agendamento>{
    private final Connection conn;

    public ServicoControl() throws SQLException {
        conn = BD.getInstancia().getConnection();
    }
    
    public static ServicoControl Agendamentos() throws SQLException{
        return new ServicoControl();
    }
    
    @Override
    public int save(Agendamento entidade) throws DAOException {
       int linhasGravadas = 0;

        try {           
            String iQuery = "INSERT INTO Agendamento (idAgendamento, nome, sobrenome, email, telefone) VALUES (null,?,?,?,?)";
            
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
    public int update(Agendamento entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try{
            String uQuery = "UPDATE alunos SET nome = ?, sobrenome = ?, email = ?, telefone = ? WHERE idAgendamento = ?";
            
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
    public int delete(Agendamento entidade) throws DAOException {
        int linhasAfetadas=0;
        try{
            String uQuery = "DELETE FROM alunos WHERE idAgendamento = ?";
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setInt(1, entidade.getIdAgendamento());
            
            linhasAfetadas = st.executeUpdate();
        }catch(SQLException ex){
            throw new DAOException("Erro ao tentar apagar Aluno. SQLSTATE: "+ex.getSQLState());
        }
        return 0;
    }

    @Override
    public List<Agendamento> findAll() throws DAOException {
        List<Agendamento> agendamentos = new ArrayList<>();
    
        try {
            String query = "SELECT * FROM alunos";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Agendamento agendamento;
                agendamento = new Agendamento(rs.getInt("idAgendamento"), rs.getString("nome"),rs.getString("sobrenome"),rs.getString("telefone"),rs.getString("email"));

                agendamentos.add(agendamento);
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar listar Alunos. SQLSTATE: " + ex.getSQLState());
        }

        return agendamentos;
    }

    @Override
    public Agendamento findOne(Agendamento entidade) throws DAOException {
       Agendamento agendamento = null;
       try {
           String query = "SELECT * FROM alunos WHERE idAgendamento = ?";
           PreparedStatement st = conn.prepareStatement(query);
           st.setInt(1, entidade.getIdAgendamento());
           ResultSet rs = st.executeQuery();

           if (rs.next()) {
               agendamento = new Agendamento(rs.getInt("idAgendamento"), rs.getString("nome"),rs.getString("sobrenome"),rs.getString("telefone"),rs.getString("email"));
           }
       } catch (SQLException ex) {
           throw new DAOException("Erro ao tentar encontrar Aluno. SQLSTATE: " + ex.getSQLState());
       }

       return agendamento;
    }
}
