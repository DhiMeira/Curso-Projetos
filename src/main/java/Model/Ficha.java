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
public class Ficha {
    public Ficha(){}
    
    public Ficha(String nome,String forca,String con,String des,String inte,String sab,String car,String pv,String ca,String ataque,String tipoFicha){
    this.nome=nome;
    this.forca=forca;
    this.constituicao=con;
    this.destreza=des;
    this.inteligencia=inte;
    this.sabedoria=sab;
    this.carisma=car;
    this.pv=pv;
    this.ca=ca;
    this.ataque=ataque;
    this.tipoFicha=tipoFicha;
    
    }
    private int id;
    private String nome;
    private String forca;
    private String constituicao;
    private String destreza;
    private String inteligencia;
    private String sabedoria;
    private String carisma;
    
    private String pv;
    private String ca;
    private String ataque;
    private String tipoFicha;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the forca
     */
    public String getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(String forca) {
        this.forca = forca;
    }

    /**
     * @return the constituicao
     */
    public String getConstituicao() {
        return constituicao;
    }

    /**
     * @param constituicao the constituicao to set
     */
    public void setConstituicao(String constituicao) {
        this.constituicao = constituicao;
    }

    /**
     * @return the destreza
     */
    public String getDestreza() {
        return destreza;
    }

    /**
     * @param destreza the destreza to set
     */
    public void setDestreza(String destreza) {
        this.destreza = destreza;
    }

    /**
     * @return the inteligencia
     */
    public String getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia the inteligencia to set
     */
    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return the sabedoria
     */
    public String getSabedoria() {
        return sabedoria;
    }

    /**
     * @param sabedoria the sabedoria to set
     */
    public void setSabedoria(String sabedoria) {
        this.sabedoria = sabedoria;
    }

    /**
     * @return the carisma
     */
    public String getCarisma() {
        return carisma;
    }

    /**
     * @param carisma the carisma to set
     */
    public void setCarisma(String carisma) {
        this.carisma = carisma;
    }

    /**
     * @return the pv
     */
    public String getPv() {
        return pv;
    }

    /**
     * @param pv the pv to set
     */
    public void setPv(String pv) {
        this.pv = pv;
    }

    /**
     * @return the ca
     */
    public String getCa() {
        return ca;
    }

    /**
     * @param ca the ca to set
     */
    public void setCa(String ca) {
        this.ca = ca;
    }

    /**
     * @return the ataque
     */
    public String getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the tipoFicha
     */
    public String getTipoFicha(){
        
        return tipoFicha;
    }

    /**
     * @param tipoFicha the tipoFicha to set
     */
    public void setTipoFicha(String tipoFicha){
       
        this.tipoFicha = tipoFicha;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
