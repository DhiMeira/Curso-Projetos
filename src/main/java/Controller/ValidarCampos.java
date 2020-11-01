/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CriarPersonagem;
import javax.swing.JOptionPane;


/**
 *
 * @author Dhii
 */
public class  ValidarCampos {
  
    public void  TratarDadosFicha(String nome,String forca,String con,String des,String inte,String sab,String car,String pv,String ca,String ataque,int tipoFicha){
      
        if(TratarString(nome) || TratarString(ataque)){
            String tipo ="";
            if(tipoFicha==1){
                tipo="Personagem";
            }else{
                 tipo="NPC";
            }
            CriarPersonagem.NovoPersonagem(nome, forca, con, des, inte, sab, car, pv, ca, ataque,tipo);
            JOptionPane.showMessageDialog(null,"Ficha criada com sucesso!");
        }else{
            System.out.println("Strings invalidas,classe SalvarFicha");
        }
    }
    private boolean TratarString(String palavra){
     
        if(palavra.equals(null) || palavra.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
        
    }
    public int ConverterParaInteiro(String atributo){
        int atributoConvertido = Integer.parseInt(atributo);
        return atributoConvertido;
    }
    public boolean IsCampoVazio(String campo){
        if(!campo.trim().isEmpty()){
            
            return false;
        }else{
             return true;
        }
    
    }
 
}
