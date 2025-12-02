package ar.com.monstersToys.productos.producto;

public class ImprimirProducto {
    static void mostrarProducto(String titulo, Producto p) {
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("| " + titulo + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-36s | %-30s | %-10s | %-10s |%n",
                "ID", "NOMBRE", "STOCK", "PRECIO");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-36s | %-30s | %-10d | %-10.2f |%n",
                p.getID(), p.getNombre(), p.getCantidadEnStock(), p.getPrecio());
    }
}