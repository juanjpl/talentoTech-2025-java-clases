package ar.com.monstersToys.productos.producto;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarProducto {

    public static void eliminarProducto(ArrayList<Producto> listaProductos) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Eliminaremos un producto...");
        System.out.println("Ingrese parte del nombre o el ID completo del producto:");
        String textoBusqueda = sc.nextLine().trim().toLowerCase();

        // LISTA AUXILIAR — acumula coincidencias
        ArrayList<Producto> coincidencias = new ArrayList<>();

        // Buscar coincidencias
        for (Producto p : listaProductos) {

            boolean coincideNombre = p.getNombre().toLowerCase().contains(textoBusqueda);
            boolean coincideID = p.getID().toLowerCase().equals(textoBusqueda);

            if (coincideNombre || coincideID) {
                coincidencias.add(p);
            }
        }

        // Si no hay resultados
        if (coincidencias.isEmpty()) {
            System.out.println("No se encontraron productos que coincidan.");
            return;
        }

        // Mostrar coincidencias
        System.out.println("Productos encontrados:");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-36s | %-30s | %-10s | %-10s |%n",
                "ID", "NOMBRE", "STOCK", "PRECIO");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (Producto p : coincidencias) {
            System.out.printf("| %-36s | %-30s | %-10d | %-10.2f |%n",
                    p.getID(), p.getNombre(), p.getCantidadEnStock(), p.getPrecio());
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        // Solicitar ID del producto a eliminar
        System.out.println("Ingrese el ID EXACTO del producto que desea eliminar:");
        String idEliminar = sc.nextLine().trim();

        // Buscar ese ID dentro de la lista original
        Producto productoAEliminar = null;
        int indiceEliminar = -1;

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getID().equals(idEliminar)) {
                productoAEliminar = listaProductos.get(i);
                indiceEliminar = i;
                break;
            }
        }

        if (productoAEliminar == null) {
            System.out.println("El ID ingresado no corresponde a ningún producto de la lista.");
            return;
        }

        // Mostrar datos del producto seleccionado
        System.out.println("Seleccionaste el siguiente producto:");
        System.out.printf("ID: %s | Nombre: %s | Stock: %d | Precio: %.2f%n",
                productoAEliminar.getID(),
                productoAEliminar.getNombre(),
                productoAEliminar.getCantidadEnStock(),
                productoAEliminar.getPrecio());

        // Confirmación
        System.out.println("¿Desea eliminarlo? (SI/NO)");
        String confirmacion = sc.nextLine().trim();

        if (confirmacion.equalsIgnoreCase("SI")) {
            listaProductos.remove(indiceEliminar);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto NO fue eliminado.");
        }
    }
}
