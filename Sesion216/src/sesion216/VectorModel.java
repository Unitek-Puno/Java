/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion216;

import java.util.Vector;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author fr3dy
 */
class VectorModel implements ListModel {

    private Vector<Object> datos;
    
    public VectorModel(Vector<Object> datos) {
        this.datos = datos;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
