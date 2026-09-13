public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto producto1 = new Producto("Cuaderno", 5000);
        Producto producto2 = new Producto("Lapiz", 2000);
        Producto producto3 = new Producto("Borrador", 1500);

        Producto producto4 = new Producto("Regla", 3000);
        Producto producto5 = new Producto("Colores", 10000);
        Producto producto6 = new Producto("Marcador", 4000);

        // Agregar productos al array
        inventario.agregarAlArray(producto1, 0);
        inventario.agregarAlArray(producto2, 1);
        inventario.agregarAlArray(producto3, 2);

        // Agregar productos al ArrayList
        inventario.agregarALista(producto4);
        inventario.agregarALista(producto5);
        inventario.agregarALista(producto6);

        // Mostrar información
        inventario.mostrarArray();
        inventario.mostrarLista();
    }
}