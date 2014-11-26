/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author fr3dy
 */
public class VentanaFrame  extends Frame {
    private Button b1, b2, b3, b4, b5; 
    
    public VentanaFrame() {
        super("Esta es la ventana 1");
        
        setLayout(new BorderLayout());
        
        b1 = new Button("Norte");
        add(b1, BorderLayout.NORTH);
        
        b2 = new Button("Sur");
        add(b2, BorderLayout.SOUTH);
        
        b3 = new Button("Oeste");
        add(b3, BorderLayout.WEST);

        b4 = new Button("Este");
        add(b4, BorderLayout.EAST);

        b5 = new Button("Centro");
        add(b5, BorderLayout.CENTER);
        
        setSize(300,300);
        setVisible(true);
    }
    
}
