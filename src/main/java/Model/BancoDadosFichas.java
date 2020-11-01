/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Dhii
 */
public class BancoDadosFichas {
     ArrayList<Ficha> bdFichas = new  ArrayList<Ficha>();
     
     
     
     
    public void AdicionarNovaFicha(Ficha novaFicha){
         String sql = "Insert into ficha(nome,tipo,forca,con,des,inte,sab,car,pv,ca,atk) values (?,?,?,?,?,?,?,?,?,?,?)";
       
        Connection con = ConexaoBanco.getConexao();
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             
            
             stmt.setString(1,novaFicha.getNome());
             stmt.setString(2,novaFicha.getTipoFicha());
             stmt.setString(3,novaFicha.getForca());
             stmt.setString(4,novaFicha.getConstituicao());
             stmt.setString(5,novaFicha.getDestreza());
             stmt.setString(6,novaFicha.getInteligencia());
             stmt.setString(7,novaFicha.getSabedoria());
             stmt.setString(8,novaFicha.getCarisma());
             stmt.setString(9,novaFicha.getPv());
             stmt.setString(10,novaFicha.getCa());
             stmt.setString(11,novaFicha.getAtaque());
             
             stmt.executeUpdate();
             ConexaoBanco.closeConexao(con, stmt);
             System.out.println("Ficha salva no bd com sucesso");
             
             
         } catch (SQLException ex) {
            System.out.println(ex);
            ConexaoBanco.closeConexao(con, stmt);
         }finally {
            ConexaoBanco.closeConexao(con, stmt);
        }
       
        
        System.out.println("+++++Adicionado ao banco com sucesso+++++");
    }
    public void AtualizarFicha(Ficha novaFicha){
        String sql = "UPDATE ficha SET nome=?,tipo=?,forca=?,con=?,des=?,inte=?,sab=?,car=?,pv=?,ca=?,atk=? WHERE id=?";
       
        Connection con = ConexaoBanco.getConexao();
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             
            
             stmt.setString(1,novaFicha.getNome());
             stmt.setString(2,novaFicha.getTipoFicha());
             stmt.setString(3,novaFicha.getForca());
             stmt.setString(4,novaFicha.getConstituicao());
             stmt.setString(5,novaFicha.getDestreza());
             stmt.setString(6,novaFicha.getInteligencia());
             stmt.setString(7,novaFicha.getSabedoria());
             stmt.setString(8,novaFicha.getCarisma());
             stmt.setString(9,novaFicha.getPv());
             stmt.setString(10,novaFicha.getCa());
             stmt.setString(11,novaFicha.getAtaque());
             stmt.setInt(12,novaFicha.getId());
             
             stmt.executeUpdate();
             ConexaoBanco.closeConexao(con, stmt);
             System.out.println("Ficha Atualizada no bd com sucesso");
             
             
         } catch (SQLException ex) {
            System.out.println("Erro ao Atualizar ficha:"+ex);
            ConexaoBanco.closeConexao(con, stmt);
         }finally {
            ConexaoBanco.closeConexao(con, stmt);
        }

    }
    public void DeletaFicha(int id){
     String sql="DELETE FROM ficha WHERE id=?";
     Connection con = ConexaoBanco.getConexao();
     PreparedStatement stmt = null;
     
      
        try {
            stmt=con.prepareStatement(sql);
            
             stmt.setInt(1,id);
             stmt.execute();
             
              System.out.println("Ficha Apagada com sucesso");
             
         } catch (SQLException ex) {
             
            System.out.println("Erro ao Atualizar ficha:"+ex);
             
         }finally{
         
          ConexaoBanco.closeConexao(con, stmt);
         }
    
    }
    public static ArrayList<Ficha> ListaFichas(){
        
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
            
         /*  if(rs.getString("tipo").equals("1")){
                 ficha.setTipoFicha("Personagem");
            }else if(rs.getString("tipo").equals("2")){
                  ficha.setTipoFicha("NPC");
            }*/
           
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
    }
    
 
}
