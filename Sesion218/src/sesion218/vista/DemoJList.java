/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion218.vista;

import sesion218.model.DepartamentoDTO;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Collection;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import sesion218.controlador.Facade;
import sesion218.controlador.Facade;

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
        
        Facade facade = new Facade();
        Collection<DepartamentoDTO> collDepts = facade.obtenerDepartamentos();

        for (DepartamentoDTO dto: collDepts) {
            
            v.add(dto.getDname());
            
        }
        
        return v;
    }
}
