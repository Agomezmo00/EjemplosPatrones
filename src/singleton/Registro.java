package singleton;

import java.util.ArrayList;


public class Registro {

    private static Registro instancia;
    
    private Registro() {    
        listado = new ArrayList();
    }
    
    public static Registro getInstancia() {
        if(instancia == null)
            instancia = new Registro();
        return instancia;
    }
    
    public void agregarVenta(String producto, int cantidad) {
        listado.add( new Ventas(producto, cantidad) );
    }
    
    @Override
    public String toString() {
        String s = "\nVentas realizadas:\n";
        for(Ventas v : listado)
            s += v.toString();
        return s;        
    }
    
    private ArrayList<Ventas> listado;
    
    public class Ventas {
        private String nombreProducto;
        private int cantidad;

        public Ventas(String nombreProducto, int cantidad) {
            this.nombreProducto = nombreProducto;
            this.cantidad = cantidad;
        }
        
        @Override
        public String toString() {
            return "\nNombre del producto: "+nombreProducto
                  +"\nCantidad adquirida: "+cantidad+"\n";            
        }
    }
}
