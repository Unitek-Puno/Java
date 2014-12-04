/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion216;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author fr3dy
 */
public class DemoJList extends JFrame {
    public DemoJList () {
        super("Demo JList");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        Vector<Object> datos = _obtenerVectorDatos();
        
        JList lista = new JList (new VectorModel(datos));
        
        JScrollPane scrollLista = new JScrollPane(lista);
        
        content.add(scrollLista, BorderLayout.CENTER);
        
        setSize(300, 300);
        setVisible(true);
    }

    private Vector<Object> _obtenerVectorDatos() {
        Vector<Object> v = new Vector<Object>();
        v.add("John Lennon");
        v.add("Paul McCartney");
        v.add("George Harrison");
        v.add("Ringo Star");
        v.add("Sandro (Roberto Sanchez)");
        v.add("Charly Garcia");
        v.add("Caetano Veloso");
        
        
        return v;
    }
}
