/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion206;

import java.sql.*;

/**
 *
 * @author fr3dy
 */
public class Sesion206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usr = "root";
        String pwd = "root";
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/distribuida";
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usr, pwd);
            String sql = "SELECT paterno, materno, nombres FROM amigo LIMIT 10";

            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                System.out.print(rs.getString("paterno") + ", ");
                System.out.print(rs.getString("materno") + ", ");
                System.out.println(rs.getString("nombres") );
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        
        
    }
    
}
