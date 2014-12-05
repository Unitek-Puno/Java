/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion218.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;
import sesion218.util.UConnection;

/**
 *
 * @author fr3dy
 */
public class EmpleadoDAO {
    public Collection<EmpleadoDTO> buscarXDept(int deptno)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        Vector<EmpleadoDTO> ret = new Vector<EmpleadoDTO>();
        
        try {
            con = UConnection.getConnection();
            String sql = "";
            sql +=  "SELECT empno, ename, hiredate, deptno "
                +   "FROM empleado "
                +   "WHERE deptno = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, deptno);
            rs = pstm.executeQuery();
            
            EmpleadoDTO dto = null;
            
            while (rs.next()) {
                dto = new EmpleadoDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setHiredate(rs.getDate("hiredate"));
                dto.setDeptno(rs.getInt("deptno"));
                ret.add(dto);
            }
            
            
        } catch (Exception e) {
        }
        
            return ret;
    }
}
