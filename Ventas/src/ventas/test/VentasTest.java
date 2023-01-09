package ventas.test;

import ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        
        Orden orden1= new Orden();
        orden1.agregarpRODUCTO(producto1);
        orden1.agregarpRODUCTO(producto2);
        orden1.mostrarOrden();
    }
}
