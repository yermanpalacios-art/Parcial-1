public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
    }
}