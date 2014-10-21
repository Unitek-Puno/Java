package sesion204;

/**
 *
 * @author fr3dy
 */
public class MiColeccion {

    private Object datos[] = null;
    private int len = 0;
    
    public MiColeccion (int capacidadInicial) {
        datos = new Object[capacidadInicial];
    }
    
    public Object obtener (int i) {
        return datos[i];
    }
    
    public int cantidad () {
        return len;
    }
    
    public void insertar(Object elemento, int i) {
        if (len == datos.length) {
            Object aux[] = datos;
            datos = new Object[datos.length * 2];
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
    
    public int buscar (Object elemento) {
        int i = 0;
        for ( ;i < len && !datos[i].equals(elemento); i++);
        return i<len ? i : -1;
    }
    
    public void agregar(Object elemento) {
        insertar(elemento, len);
    }
    
    public Object eliminar (int i) {
        Object aux = datos[i];
        for (int j = i; j < len-1; j++) {
            datos[j] = datos[j+1];
        }
        
        len--;
        
        return aux;
    }
}
