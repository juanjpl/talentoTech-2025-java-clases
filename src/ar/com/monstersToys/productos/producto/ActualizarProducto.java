package ar.com.monstersToys.productos.producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ActualizarProducto {

    public static void actualizarProducto(ArrayList<Producto> listaProductos) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el ID del producto a actualizar: ");
        String id_producto_a_actualizar = sc.nextLine();

        ArrayList<Object> resultadoBusqueda =
                BuscarProductoByID.buscarProductoByID(listaProductos, id_producto_a_actualizar);

        if (resultadoBusqueda.isEmpty()) {
            System.out.println("No se ha encontrado ningún producto con ese ID");
            return;
        }

        Producto productoEncontrado = (Producto) resultadoBusqueda.get(0);
        int indiceEncontrado = (int) resultadoBusqueda.get(1);

        System.out.println("Se ha encontrado el producto.");
        ImprimirProducto.mostrarProducto("PRODUCTO ACTUAL", productoEncontrado);

        // Solicitar datos nuevos
        System.out.println("Ingrese el nombre del producto a actualizar: ");
        String nombreNuevo = sc.nextLine();

        System.out.println("Ingrese el stock del producto a actualizar: ");
        int stockNuevo = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el precio del producto a actualizar: ");
        double precioNuevo = Double.parseDouble(sc.nextLine());

        // Mostrar comparación
        ImprimirProductoActualizado.mostrarProductoActualizado(productoEncontrado, nombreNuevo, stockNuevo, precioNuevo);

        System.out.println("¿Deseas actualizar el producto? SI/NO");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("SI")) {

            // Aquí NO se crea un objeto nuevo
            productoEncontrado.setNombre(nombreNuevo);
            productoEncontrado.setCantidadEnStock(stockNuevo);
            productoEncontrado.setPrecio(precioNuevo);

            // Por si cambia el tipo de producto, no es necesario alterar nada más
            listaProductos.set(indiceEncontrado, productoEncontrado);

            System.out.println("El producto fue actualizado exitosamente!");

        } else {
            System.out.println("El producto no fue actualizado.");
        }
    }
}
