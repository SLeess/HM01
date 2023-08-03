
package br.unimontes.hm01.controller;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FuncionarioControl implements Control<Funcionario>{
    private final Connection conn;

    public FuncionarioControl() throws SQLException {
        conn = BD.getInstancia().getConnection();
    }
    
    public static FuncionarioControl funcionarios() throws SQLException{
        return new FuncionarioControl();
    }
    
    @Override
    public int save(Funcionario entidade) throws DAOException {
       int linhasGravadas = 0;

        try {           
            String iQuery = "INSERT INTO Funcionario (CPF, nome) VALUES (?,?)";
            
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entidade.getCPF());
            st.setString(2, entidade.getNome());
           
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entidade);
            }
            else throw new DAOException("Erro ao tentar gravar entidade Funcionario. SQLSTATE: "+ex.getSQLState());
        }
        
        
        return linhasGravadas;
    }
    
    @Override
    public int update(Funcionario entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try{
            String uQuery = "UPDATE Funcionario SET nome = ? WHERE CPF = ?";
            
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getCPF());
            
            linhasAfetadas = st.executeUpdate();
                        
        } catch(SQLException ex){
            throw new DAOException("Erro ao tentar atualizar entidade Funcionario. SQLSTATE: "+ex.getSQLState());
        }
        
        return linhasAfetadas;
    }
    
    @Override
    public int delete(Funcionario entidade) throws DAOException {
        int linhasAfetadas=0;
        try{
            String uQuery = "DELETE FROM Funcionario WHERE CPF = ?";
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getCPF());
            
            linhasAfetadas = st.executeUpdate();
        }catch(SQLException ex){
            throw new DAOException("Erro ao tentar apagar Funcionario. SQLSTATE: "+ex.getSQLState());
        }
        return 0;
    }
    
    @Override
    public List<Funcionario> findAll() throws DAOException {
        List<Funcionario> funcionarios = new ArrayList<>();
    
        try {
            String query = "SELECT * FROM Funcionario";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Funcionario funcionario;
                funcionario = new Funcionario(rs.getString("CPF"), rs.getString("nome"));

                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar listar Cliente. SQLSTATE: " + ex.getSQLState());
        }

        return funcionarios;
    }
    
    @Override
    public Funcionario findOne(Funcionario entidade) throws DAOException {
       Funcionario funcionario = null;
       try {
           String query = "SELECT * FROM Funcionario WHERE CPF = ?";
           PreparedStatement st = conn.prepareStatement(query);
           st.setString(1, entidade.getCPF());
           ResultSet rs = st.executeQuery();

           if (rs.next()) {
               funcionario = new Funcionario(rs.getString("CPF"), rs.getString("nome"));
           }
       } catch (SQLException ex) {
           throw new DAOException("Erro ao tentar encontrar Funcionario. SQLSTATE: " + ex.getSQLState());
       }

       return funcionario;
    }

    @Override
    public DefaultTableModel carregar(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();   
        ArrayList<Funcionario> res = new ArrayList<>();
        try {
            res = (ArrayList)this.findAll();
        } catch (DAOException ex) {
            System.out.println("Faio Aqui Funcionario" + ex.toString());
        }
        
        modelo.setNumRows(0);
        
        //-------------------------------------
        //MUDAR A ORDEM DEPENDENDO DA TABLE
        //-------------------------------------
        
        for(Funcionario fun : res){
            modelo.addRow(new Object[]{fun.getNome(),fun.getCPF()});  
        }
        return modelo;
    }
    
    @Override
    public void findSelected(Funcionario a, JTable table) throws SQLException {
        String query = "SELECT * FROM funcionario WHERE ";
        List<Object> params = new ArrayList<>();
        boolean hasCondition = false;

        if ("".equals(a.getCPF())) {
            query += "CPF=?";
            params.add(a.getCPF());
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
            }
            paramIndex++;
        }

        DefaultTableModel modelo = (DefaultTableModel) table.getModel();   
        modelo.setNumRows(0);
        ResultSet res = st.executeQuery();
        
        while (res.next()) {
            modelo.addRow(new Object[]{res.getInt("CPF"), res.getString("nome")});
        }
    }
}
