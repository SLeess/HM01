package br.unimontes.hm01.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    Connection conexao = null;
    private String hostname;
    private int port;
    private String database;
    private String username;
    private String password;
    private static BD instancia = null;
    
    public BD() throws SQLException{
        try {
            hostname = "localhost";
            port = 3306;
            this.database = "HM01";
            username = "root";
            password = "";
            
            String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conexao = DriverManager.getConnection(url, username, password);
        }catch(SQLException ex){
            System.out.println("Falha na conexão com o banco " + ex.getMessage());
        } catch(Exception ex){
            System.out.println("Erro geral " + ex.getMessage());
        }
    }   
    
    public Connection getConnection(){
        return this.conexao;
    }
    
    public String getDatabase(){
        return this.database;
    }
    
    public final void closeDataSource() throws SQLException{
        try{
            this.conexao.close();
        } catch(SQLException ex){
            System.out.println("Erro ao desconectar do banco: " + ex.getMessage());
        }
    }   
    
    public static BD getInstancia() throws SQLException {
        if (instancia == null)
            instancia = new BD();
        return instancia;
    }
}