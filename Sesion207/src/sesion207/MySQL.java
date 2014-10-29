/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion207;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author fr3dy
 */
public class MySQL {
        String usr;
        String pwd;
        String driver;
        String url;

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

    public MySQL() {

        usr = "root";
        pwd = "root";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost/distribuida";
        
    }
    
    public ResultSet consultar (String query) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usr, pwd);

            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    
    }
}
