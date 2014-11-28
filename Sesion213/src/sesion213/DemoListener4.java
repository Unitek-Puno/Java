/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion213;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author fr3dy
 */
public class DemoListener4 extends Frame {
    public DemoListener4(){
        super("Demo");
        addWindowListener(new EscuchaVentana());
        setSize(200,150);
        setVisible(true);
    }
    
    class EscuchaVentana implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
        
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Oculto...");
            setVisible(false);
            System.out.println("Libero...");
            dispose();
            System.out.println("Bye Bye...");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
        
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        
        }

        @Override
        public void windowActivated(WindowEvent e) {
        
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        
        }
    
    }
}
