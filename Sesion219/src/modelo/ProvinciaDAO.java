/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;
import util.UConnection;

/**
 *
 * @author fr3dy
 */
public class ProvinciaDAO {
    public Collection<ProvinciaDTO> buscarTodos()
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            con = UConnection.getConnection();
            String sql = "SELECT p.* FROM ubprovincia p";
            
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            Vector<ProvinciaDTO> ret = new Vector<ProvinciaDTO>();
            ProvinciaDTO dto = null;
            
            while( rs.next() ){
                dto = new ProvinciaDTO();
                dto.setIdprov(rs.getInt("IdProv"));
                dto.setProvincia(rs.getString("provincia"));
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
    
    public Collection<ProvinciaDTO> buscarPorDepartamento (int iddepa)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            con = UConnection.getConnection();
            String sql  =   "SELECT p.* "
                        +   "FROM ubprovincia p "
                        +   "WHERE p.IdDepa = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, iddepa);
            rs = pstm.executeQuery();
            
            Vector<ProvinciaDTO> ret = new Vector<ProvinciaDTO>();
            ProvinciaDTO dto = null;
            
            while(rs.next())
            {
                dto = new ProvinciaDTO();
                dto.setIdprov(rs.getInt("IdProv"));
                dto.setProvincia(rs.getString("provincia"));
                dto.setIddepa(rs.getInt("IdDepa"));
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
