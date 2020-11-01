/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dhii
 */
public class CriarPersonagem {
    static BancoDadosFichas bd = new BancoDadosFichas();
    
    public static void NovoPersonagem(String nome,String forca,String con,String des,String inte,String sab,String car,String pv,String ca,String ataque,String tipoFicha){
        //Por que não passar uma string aqui? no tipo?
        Ficha novaFicha = new Ficha(nome,forca,con,des,inte,sab,car,pv,ca,ataque,tipoFicha);
        bd.AdicionarNovaFicha(novaFicha);
        
    }
}
