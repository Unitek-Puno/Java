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
        String usr = "sa";
        String pwd = "";
        String driver = "org.hsqldb.jdbcDriver";
        String url = "jdbc:hsqldb:hsql://localhost/xdb";
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usr, pwd);
            String sql = "SELECT empno, ename, hiredate, deptno FROM emp";

            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                System.out.print(rs.getInt("empno") + ", ");
                System.out.print(rs.getInt("ename") + ", ");
                System.out.print(rs.getInt("hiredate") + ", ");
                System.out.println(rs.getInt("deptno") );
                
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
