/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion204;

import java.util.Scanner;

/**
 *
 * @author fr3dy
 */
public class Sesion204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MiColeccion mc = new MiColeccion(2);
        System.out.println("Ingrese Nombre");
        
        String nom = scanner.next();
        
        while ( !nom.equals("FIN")) {
            mc.insertar(nom, 0);
            nom = scanner.next();
        }
        
        String aux;
        
        for (int i = 0; i < mc.cantidad(); i++) {
            aux = (String) mc.obtener(i);
            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
    }
    
}
