/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dhii
 */
public class ConexaoBanco {
    public static final String DRIVER="com.mysql.jdbc.Driver";
   
    public static final String URL="jdbc:mysql://127.0.0.1:3306/rpgbanco?useSSL=false";
    public static final String USER="root";
    public static final String PASS="1234";
    
    public static Connection getConexao(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);           
            
            
        } catch (SQLException | ClassNotFoundException ex) {
           throw new RuntimeException("Erro ao criar conexao:"+ex);
        }
       
    }
    public static void closeConexao(Connection con){
            if(con !=null){
                
                try {
                    con.close();
                    System.out.println("Conexao fechada com sucesso!");
                } catch (SQLException ex) {
                    System.err.println("Erro:"+ex);
                }
                
            }
        
    }
    public static void closeConexao(Connection con,PreparedStatement stm){
            if(stm !=null){
                
                try {
                    stm.close();
                     System.out.println("Conexao fechada com sucesso!");
                } catch (SQLException ex) {
                    System.err.println("Erro:"+ex);
                }
                
            }
            closeConexao(con);
        
    }
    public static void closeConexao(Connection con,PreparedStatement stm,ResultSet rs){
            if(rs !=null){
                
                try {
                    rs.close();
                     System.out.println("Conexao fechada com sucesso!");
                } catch (SQLException ex) {
                    System.err.println("Erro:"+ex);
                }
                
            }
         
            closeConexao(con,stm);
        
    }
    /*public static ArrayList<Ficha> ListaFichas(){
            String sql="SELECT * FROM ficha";
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement stmt=null;
            ArrayList<Ficha> fichas = new ArrayList();
            
            ResultSet rs = null;
            
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Ficha ficha = new Ficha();
            
            ficha.setId(rs.getInt("id"));
            ficha.setNome(rs.getString("nome"));
            
         
             ficha.setTipoFicha(rs.getString("tipo"));
             ficha.setForca(rs.getString("forca"));
             ficha.setConstituicao(rs.getString("con"));
             ficha.setDestreza(rs.getString("des"));
             ficha.setInteligencia(rs.getString("inte"));
             ficha.setSabedoria(rs.getString("sab"));
             ficha.setCarisma(rs.getString("car"));
             ficha.setPv(rs.getString("pv"));
             ficha.setCa(rs.getString("ca"));
             ficha.setAtaque(rs.getString("atk"));
             
             fichas.add(ficha);
            
            }
        } catch (SQLException ex) {
           System.err.println("Erro ao obter dados do BD:"+ex);
        }finally{
            ConexaoBanco.closeConexao(con, stmt, rs);
        }
        
        return fichas;
    }*/
}
