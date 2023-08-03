
package br.unimontes.hm01.controller;

import br.unimontes.hm01.DAO.DAOException;
import br.unimontes.hm01.model.Funcionario;
import br.unimontes.hm01.model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ServicoControl implements Control<Servico>{
    private final Connection conn;

    public ServicoControl() throws SQLException {
        conn = BD.getInstancia().getConnection();
    }
    
    public static ServicoControl Servico() throws SQLException{
        return new ServicoControl();
    }
    
    @Override
    public int save(Servico entidade) throws DAOException {
       int linhasGravadas = 0;

        try {           
            String iQuery = "INSERT INTO Servico (idServico, nome, descricao, preco) VALUES (null,?,?,?)";
            
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getDescricao());
            st.setFloat(3, entidade.getPreco());
           
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entidade);
            }
            else throw new DAOException("Erro ao tentar gravar entidade Servico. SQLSTATE: "+ex.getSQLState());
        }
        
        
        return linhasGravadas;
    }
    
    @Override
    public int update(Servico entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try{
            String uQuery = "UPDATE Servico SET nome = ?, descricao = ?, preco = ? WHERE idServico = ?";
            
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getDescricao());
            st.setFloat(3, entidade.getPreco());
            st.setInt(4, entidade.getIdServico());
            
            linhasAfetadas = st.executeUpdate();
                        
        } catch(SQLException ex){
            throw new DAOException("Erro ao tentar atualizar entidade Servico. SQLSTATE: "+ex.getSQLState());
        }
        
        return linhasAfetadas;
    }
    
    @Override
    public int delete(Servico entidade) throws DAOException {
        int linhasAfetadas=0;
        try{
            String uQuery = "DELETE FROM Servico WHERE idServico = ?";
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setInt(1, entidade.getIdServico());
            
            linhasAfetadas = st.executeUpdate();
        }catch(SQLException ex){
            throw new DAOException("Erro ao tentar apagar Servico. SQLSTATE: "+ex.getSQLState());
        }
        return 0;
    }
    
    @Override
    public List<Servico> findAll() throws DAOException {
        List<Servico> servicos = new ArrayList<>();
    
        try {
            String query = "SELECT * FROM Servico";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Servico servico;
                servico = new Servico(rs.getInt("idServico"), rs.getString("nome"), rs.getString("descricao"), rs.getFloat("preco"));

                servicos.add(servico);
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar listar Servico. SQLSTATE: " + ex.getSQLState());
        }

        return servicos;
    }
    
    @Override
    public Servico findOne(Servico entidade) throws DAOException {
       Servico servico = null;
       try {
           String query = "SELECT * FROM Servico WHERE idServico = ?";
           PreparedStatement st = conn.prepareStatement(query);
           st.setInt(1, entidade.getIdServico());
           ResultSet rs = st.executeQuery();

           if (rs.next()) {
                servico = new Servico(rs.getInt("idServico"), rs.getString("nome"), rs.getString("descricao"), rs.getFloat("preco"));
           }
       } catch (SQLException ex) {
           throw new DAOException("Erro ao tentar encontrar Servico. SQLSTATE: " + ex.getSQLState());
       }

       return servico;
    }

    @Override
    public DefaultTableModel carregar(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();   
        ArrayList<Servico> res = new ArrayList<>();
        try {
            res = (ArrayList)this.findAll();
        } catch (DAOException ex) {
            System.out.println("Faio Aqui " + ex.toString());
        }
        
        modelo.setNumRows(0);
        
        //-------------------------------------
        //MUDAR A ORDEM DEPENDENDO DA TABLE
        //-------------------------------------
        
        for(Servico cli : res){
            modelo.addRow(new Object[]{cli.getIdServico(),cli.getDescricao(),cli.getNome(), cli.getPreco()});  
        }
        return modelo;
    }
    
    @Override
    public void findSelected(Servico a, JTable table) throws SQLException {
        String query = "SELECT * FROM servico WHERE ";
        List<Object> params = new ArrayList<>();
        boolean hasCondition = false;

        if (a.getIdServico()!= -1) {
            query += "idServico=?";
            params.add(a.getIdServico());
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
        if (!"".equals(a.getDescricao())) {
            if (hasCondition) {
                query += " AND ";
            }
            query += "descricao=?";
            params.add(a.getDescricao());
            hasCondition = true;
        }
        if (a.getPreco() != -1.0f) {
            if (hasCondition) {
                query += " AND ";
            }
            query += "preco=?";
            params.add(a.getPreco());
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
            } else if (param instanceof Float) {
                st.setFloat(paramIndex, (Float) param);
            } else {
                st.setNull(paramIndex, java.sql.Types.LONGNVARCHAR);
            }
            paramIndex++;
        }

        DefaultTableModel modelo = (DefaultTableModel) table.getModel();   
        modelo.setNumRows(0);
        ResultSet res = st.executeQuery();
        
        while (res.next()) {
            modelo.addRow(new Object[]{res.getInt("idServico"), res.getString("nome"), res.getString("descricao"), 
                    res.getFloat("preco")});
        }
    }
}
