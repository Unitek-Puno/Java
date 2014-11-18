/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion208;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author fr3dy
 */
public class Sesion208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            con = UConnection.getConnection();
            String sql = "SELECT paterno, materno, nombres FROM amigo LIMIT 10";
            
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getString("paterno") + ", ");
                System.out.print(rs.getString("materno") + ", ");
                System.out.println(rs.getString("nombres") );
                
            }
            
        } catch (Exception e) {
        }
                */
        
        /*
        DepartamentoDAO dept = new DepartamentoDAO();
        Collection<DepartamentoDTO> coll =  dept.buscarTodos();
        
        for (DepartamentoDTO dto:coll) {
            System.out.println(dto);
        }
        */
        
        Facade facade = new Facade();
        Collection<DepartamentoDTO> collDepts = facade.obtenerDepartamentos();
        
        _mostrarDepartamentos(collDepts);
        
        Scanner scanner = new Scanner(System.in);
        int deptno = scanner.nextInt();
        
        Collection<EmpleadoDTO> collEmps = facade.obtenerEmpleados(deptno);
        _mostrarEmpleados(collEmps, deptno);
    }
    
    private static void _mostrarDepartamentos(Collection<DepartamentoDTO> collDepts)
    {
        System.out.println("Departamentos: ");
        System.out.println("------------------------------------------>");
        for (DepartamentoDTO dto: collDepts) {
            System.out.print("| "+dto.getDeptno()+"\t");
            System.out.print("| "+dto.getDname()+"\t");
            System.out.println("| "+dto.getLoc()+"\t");
        }
        System.out.println("<------------------------------------------");
        System.out.println("Ingrese deptno: ");
    }
    
    private static void _mostrarEmpleados(Collection<EmpleadoDTO> collEmps, int deptno)
    {
        System.out.println("Empleados del departamento: " + deptno);
        System.out.println("------------------------------------------>");
        for (EmpleadoDTO dto: collEmps) {
            System.out.print("| "+dto.getEmpno()+"\t");
            System.out.print("| "+dto.getEname()+"\t");
            System.out.println("| "+dto.getHiredate()+"\t|");
        }
        System.out.println("<------------------------------------------");
        
    }
}
