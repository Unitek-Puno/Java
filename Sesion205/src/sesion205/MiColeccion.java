/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion205;

/**
 *
 * @author fr3dy
 */
public class MiColeccion<T> {
    
    private Object datos[] = null;
    private int len = 0;
    
    public MiColeccion(int capacidadInicial) {
        datos = new Object[capacidadInicial];
    }
    
    public void agregar(T elemento) {
        insertar(elemento, len);
    }
    
    public void insertar (T elemento, int i) {
        if ( len == datos.length ) {
            Object aux[] = datos;
            datos = new Object[datos.length*2];
            for (int j = 0; j < len; j++) {
                datos[j] = aux[j];
            }
            aux = null;
        }
        
        for (int j = len-1; j >= i; j--) {
            datos[j+1] = datos[j];
        }
        
        datos[i] = elemento;
        len++;
    }
    
    public int cantidad () {
        return len;
    }
    
    public int buscar (T elemento) {
        int i = 0;
        for (;i<len && !datos[i].equals(elemento); i++);
        return i<len?i:-1;
    }
    
    public T eliminar (int i) {
        Object aux = datos[i];
        for (int j = i; j < len-1; j++) {
            datos[j]=datos[j+1];
        }
        len--;
        return (T)aux;
    }
    
    public T obtener (int i) {
        return (T)datos[i];
    }
    
}
