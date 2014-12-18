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
public class DepartamentoDTO {
    private int iddepa;
    private String departamento;
    
    public String toString()
    {
        return iddepa + " " + departamento;
    }

    public int getIddepa() {
        return iddepa;
    }

    public void setIddepa(int iddepa) {
        this.iddepa = iddepa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
