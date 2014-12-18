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
public class ProvinciaDTO {
    private int idprov;
    private String provincia;
    private int iddepa;
    
    public String toString()
    {
        return idprov + " " + provincia;
    }

    public int getIdprov() {
        return idprov;
    }

    public void setIdprov(int idprov) {
        this.idprov = idprov;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getIddepa() {
        return iddepa;
    }

    public void setIddepa(int iddepa) {
        this.iddepa = iddepa;
    }
    
    
}
