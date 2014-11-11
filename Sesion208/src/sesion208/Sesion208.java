/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion208;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author fr3dy
 */
public class Sesion208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
    }
    
}
