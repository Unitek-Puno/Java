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
public class DepartamentoDAO {
    public Collection<DepartamentoDTO> buscarTodos(){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            con = UConnection.getConnection();
            String sql = "SELECT * FROM departamento LIMIT 10";
            
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            Vector<DepartamentoDTO> ret = new Vector<DepartamentoDTO>();
            DepartamentoDTO dto = null;
            
            while( rs.next() ){
                dto = new DepartamentoDTO();
                dto.setDeptno(rs.getInt("deptno"));
                dto.setDname(rs.getString("dname"));
                dto.setLoc(rs.getString("loc"));
                ret.add(dto);
            }
            
            return ret;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        finally
        {
            try {
                if ( rs != null)
                    rs.close();
                if (pstm != null)
                    pstm.close();
                
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}
