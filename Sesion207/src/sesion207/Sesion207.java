/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion207;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fr3dy
 */
public class Sesion207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sql = "SELECT paterno, materno, nombres FROM contacto LIMIT 10";
        Contacto c = new Contacto();
        ResultSet rs = c.consultar(sql);

        try {
            while (rs.next()) {
                System.out.print(rs.getString("paterno") + ", ");
                System.out.print(rs.getString("materno") + ", ");
                System.out.println(rs.getString("nombres") );
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sesion207.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
