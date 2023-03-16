
package Propriedades;


public class Condominio {
    
    private int idCond;
    private String nomeCond;
    private String cep;
    private String end;
    private String obs;
    private String complemento;
    private String numero;
    
    
    
    

    /**
     * @return the numero
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param numero the numero to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    
  
    
    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the apartamentos
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param apartamentos the apartamentos to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }


    public int getIdCond() {
        return idCond;
    }

    public void setIdCond(int idCond) {
        this.idCond = idCond;
    }


    public String getNomeCond() {
        return nomeCond;
    }

    public void setNomeCond(String nomeCond) {
        this.nomeCond = nomeCond;
    }


    @Override
    public String toString(){
        return this.getNomeCond();
    }
    
 
}
