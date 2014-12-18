/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fr3dy
 */
public class DistritoDTO {
    private int iddist;
    private String distrito;
    private int idprov;
    
    public String toString()
    {
        return iddist + " " + distrito;
    }

    public int getIddist() {
        return iddist;
    }

    public void setIddist(int iddist) {
        this.iddist = iddist;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getIdprov() {
        return idprov;
    }

    public void setIdprov(int idprov) {
        this.idprov = idprov;
    }
    
    
    
}
