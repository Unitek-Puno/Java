/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion210;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author fr3dy
 */
public class Ventana1 extends Frame {
    private Button b1, b2, b3; 
    
    public Ventana1() {
        super("Esta es la ventana 1");
        
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        b1 = new Button("Boton 1");
        add(b1);
        b2 = new Button("Boton 2");
        add(b2);
        b2 = new Button("Boton 2");
        add(b2);
        
        setSize(300,300);
        setVisible(true);
    }
}
