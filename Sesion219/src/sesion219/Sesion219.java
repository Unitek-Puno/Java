/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion219;

import java.util.Collection;
import modelo.DepartamentoDAO;
import modelo.DepartamentoDTO;
import modelo.ProvinciaDAO;
import modelo.ProvinciaDTO;
import modelo.DistritoDAO;
import modelo.DistritoDTO;

/**
 *
 * @author fr3dy
 */
public class Sesion219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*********************************************************
         * Codigo para probar DepartamentoDAO
         ********************************************************* 
        DepartamentoDAO dept = new DepartamentoDAO();
        Collection<DepartamentoDTO> coll =  dept.buscarTodos();
        
        for (DepartamentoDTO dto:coll) {
            System.out.println(dto);
        }
        
        * Fin codigo para probar DepartamentoDAO *****************/
        
        /*********************************************************
         * Codigo para probar ProvinciaDAO
         ********************************************************* 
        
        ProvinciaDAO prov = new ProvinciaDAO();
        //Collection<ProvinciaDTO> coll =  prov.buscarTodos();
        Collection<ProvinciaDTO> coll =  prov.buscarPorDepartamento(5);
        
        for (ProvinciaDTO dto:coll) {
            System.out.println(dto);
        }

        * Fin codigo para probar ProvinciaDAO ********************/

        DistritoDAO prov = new DistritoDAO();
        Collection<DistritoDTO> coll =  prov.buscarPorProvincia(5);
        
        for (DistritoDTO dto:coll) {
            System.out.println(dto);
        }
        
        
    }
    
}
