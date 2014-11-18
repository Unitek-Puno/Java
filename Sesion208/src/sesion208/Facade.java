/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion208;

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
