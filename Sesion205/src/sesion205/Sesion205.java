/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion205;

import java.util.Scanner;

/**
 *
 * @author fr3dy
 */
public class Sesion205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        String nom = scanner.next();

        MiColeccion <String> mc = new MiColeccion<String>(4);
        
        
        while ( !nom.equals("FIN")) {
            mc.insertar(nom, 0);
            nom = scanner.next();
        }
        
        String aux;
        
        for (int i = 0; i < mc.cantidad(); i++) {
            aux = mc.obtener(i);
            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
        */
        
        
        /*
        MiPila<Integer> c = new MiPila<Integer>();
        
        c.apilar(1);
        c.apilar(2);
        c.apilar(3);
        
        System.out.println(c.desapilar());
        System.out.println(c.desapilar());

        c.apilar(4);

        System.out.println(c.desapilar());
        System.out.println(c.desapilar());
        */
        
        MiCola<Integer> c = new MiCola<Integer>();
        
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);
        
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());

        c.encolar(4);
        
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
    }
    
}
