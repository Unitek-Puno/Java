/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion218.controlador;

import sesion218.model.DepartamentoDAO;
import sesion218.model.EmpleadoDTO;
import sesion218.model.EmpleadoDAO;
import sesion218.model.DepartamentoDTO;
import java.util.Collection;

/**
 *
 * @author fr3dy
 */
public class Facade {
    public Collection<DepartamentoDTO> obtenerDepartamentos()
    {
        DepartamentoDAO deptDao = new DepartamentoDAO();
        return deptDao.buscarTodos();
    }
    
    public Collection<EmpleadoDTO> obtenerEmpleados(int deptno)
    {
        EmpleadoDAO empDao = new EmpleadoDAO();
        return empDao.buscarXDept(deptno);
    }
}
