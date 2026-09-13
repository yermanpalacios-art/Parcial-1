import java.util.ArrayList;

public class Inventario {

    // Array tradicional
    Producto[] productos = new Producto[3];

    // Lista dinámica
    ArrayList<Producto> listaProductos = new ArrayList<>();

    public void agregarAlArray(Producto producto, int posicion) {
        productos[posicion] = producto;
    }

    public void agregarALista(Producto producto) {
        listaProductos.add(producto);
    }

    public void mostrarArray() {
        System.out.println("PRODUCTOS DEL ARRAY:");

        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarProducto();
        }
    }

    public void mostrarLista() {
        System.out.println("\nPRODUCTOS DEL ARRAYLIST:");

        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarProducto();
        }
    }
}