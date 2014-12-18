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
public class DistritoDAO {
    public Collection<DistritoDTO> buscarPorProvincia (int idprov)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            con = UConnection.getConnection();
            String sql  =   "SELECT d.* "
                        +   "FROM ubdistrito d "
                        +   "WHERE d.IdProv = ?";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idprov);
            rs = pstm.executeQuery();
            
            Vector<DistritoDTO> ret = new Vector<DistritoDTO>();
            DistritoDTO dto = null;
            
            while(rs.next())
            {
                dto = new DistritoDTO();
                dto.setIddist(rs.getInt("idDist"));
                dto.setDistrito(rs.getString("distrito"));
                dto.setIdprov(rs.getInt("IdProv"));
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
