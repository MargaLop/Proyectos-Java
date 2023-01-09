package ventas;

public class Producto {
    private final int idProduct;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Produto(){
        this.idProduct = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProduct() {
        return idProduct;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProduct=" + idProduct + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}
