package br.unimontes.hm01.controller;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteControl implements Control<Cliente>{
    private final Connection conn;

    public ClienteControl() throws SQLException {
        conn = BD.getInstancia().getConnection();
    }
    
    public static ClienteControl clientes() throws SQLException{
        return new ClienteControl();
    }

    @Override
    public DefaultTableModel carregar(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();   
        ArrayList<Cliente> res = new ArrayList<>();
        try {
            res = (ArrayList)this.findAll();
        } catch (DAOException ex) {
            System.out.println("Faio Aqui " + ex.toString());
        }
        String email, telefone;
        modelo.setNumRows(0);
        for(Cliente cli : res){
            email = ""; telefone = "";
            if(cli.getEmail() != null)
                email = cli.getEmail();
                
            if(cli.getTelefone() != null)
                telefone = cli.getTelefone();
                
            modelo.addRow(new Object[]{cli.getIdCliente(), cli.getNome(), cli.getSobrenome(), 
                    email, telefone});  
        }
        return modelo;
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
            else throw new DAOException("Erro ao tentar gravar entidade Cliente. SQLSTATE: "+ex.getSQLState());
        }
        return linhasGravadas;
    }

     @Override
    public int update(Cliente entidade) throws DAOException {
        int linhasAfetadas = 0;
        String uQuery = "UPDATE Cliente SET nome = ?, sobrenome = ?, email = ?, telefone = ? WHERE idCliente = ?";
        try{
            
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getSobrenome());
            
            st.setString(3, entidade.getEmail());
            st.setString(4, entidade.getTelefone());
            
            st.setInt(5, entidade.getIdCliente());
            
            linhasAfetadas = st.executeUpdate();
                        
        } catch(SQLException ex){
            throw new DAOException("Erro ao tentar atualizar entidade Cliente. SQLSTATE: "+ex.getSQLState());
        }
        
        return linhasAfetadas;
    }

    @Override
    public int delete(Cliente entidade) throws DAOException {
        int linhasAfetadas=0;
        try{
            String uQuery = "DELETE FROM Cliente WHERE idCliente = ?";
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setInt(1, entidade.getIdCliente());
            
            linhasAfetadas = st.executeUpdate();
        }catch(SQLException ex){
            throw new DAOException("Erro ao tentar apagar Cliente. SQLSTATE: "+ex.getSQLState());
        }
        return 0;
    }

    @Override
    public List<Cliente> findAll() throws DAOException {
        List<Cliente> clientes = new ArrayList<>();
        try {
            String query = "SELECT * FROM cliente";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getInt("idCliente"), rs.getString("nome"),rs.getString("sobrenome"),rs.getString("telefone"),rs.getString("email")));
            }
            //System.out.println("Funou");
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar listar Clientes. SQLSTATE: " + ex.getSQLState());
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
    
    @Override
    public void findSelected(Cliente a, JTable table) throws SQLException {
        String query = "SELECT * FROM cliente WHERE ";
        List<Object> params = new ArrayList<>();
        boolean hasCondition = false;

        if (a.getIdCliente() != -1) {
            query += "idCliente=?";
            params.add(a.getIdCliente());
            hasCondition = true;
        }
        if (!"".equals(a.getNome())) {
            if (hasCondition) {
                query += " AND ";
            }
            query += "nome=?";
            params.add(a.getNome());
            hasCondition = true;
        }
        if (!"".equals(a.getSobrenome())) {
            if (hasCondition) {
                query += " AND ";
            }
            query += "sobrenome=?";
            params.add(a.getSobrenome());
            hasCondition = true;
        }
        if (!"".equals(a.getEmail())) {
            if (hasCondition) {
                query += " AND ";
            }
            query += "email=?";
            params.add(a.getEmail());
            hasCondition = true;
        }
        if (!"".equals(a.getTelefone())) {
            if (hasCondition) {
                query += " AND ";
            }
            query += "telefone=?";
            params.add(a.getTelefone());
            hasCondition = true;
        }
        
        if (!hasCondition) {
            return;
        }

        PreparedStatement st = conn.prepareStatement(query);
        
        int paramIndex = 1;
        for (Object param : params) {
            if (param instanceof String) {
                st.setString(paramIndex, (String) param);
            } else if (param instanceof Integer) {
                st.setInt(paramIndex, (Integer) param);
            } else {
                st.setNull(paramIndex, java.sql.Types.INTEGER);
            }
            paramIndex++;
        }

        DefaultTableModel modelo = (DefaultTableModel) table.getModel();   
        modelo.setNumRows(0);
        ResultSet res = st.executeQuery();
        
        while (res.next()) {
            modelo.addRow(new Object[]{res.getInt("idCliente"), res.getString("nome"), res.getString("sobrenome"), 
                    res.getString("email"), res.getString("telefone")});
        }
    }
}
