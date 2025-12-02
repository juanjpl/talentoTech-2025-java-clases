package ar.com.monstersToys.productos.producto;

public class ImprimirProductoActualizado {
    static void mostrarProductoActualizado(Producto p, String nombre, int stock, double precio) {
        System.out.println("===========================================================================================================");
        System.out.println("                             ACTUALIZACIÓN DE PRODUCTO");
        System.out.println("===========================================================================================================");

        ImprimirProducto.mostrarProducto("PRODUCTO ACTUAL", p);

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("| PRODUCTO ACTUALIZADO |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-36s | %-30s | %-10s | %-10s |%n",
                "ID", "NOMBRE", "STOCK", "PRECIO");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-36s | %-30s | %-10d | %-10.2f |%n",
                p.getID(), nombre, stock, precio);
    }
}