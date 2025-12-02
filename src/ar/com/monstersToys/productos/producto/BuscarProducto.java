package ar.com.monstersToys.productos.producto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BuscarProducto {
    public static void buscarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        ArrayList<Producto> listaProductosEncontrados = new ArrayList<Producto>();

        System.out.println("Ingrese el producto a buscar:");
        Scanner sc = new Scanner(System.in);
        String productoBuscado = sc.nextLine();
        System.out.println("Vamos a buscar un producto que contenga: " + productoBuscado);

        for (Producto prod : listaProductos) {
            if (prod.getNombre().toLowerCase().contains(productoBuscado.toLowerCase())) {
                listaProductosEncontrados.add(prod);
            }
        }

        if (listaProductosEncontrados.isEmpty()) {
            System.out.println("No existe el producto buscado.");
        } else {
            System.out.println("Se encontraron estos productos: ");
            for(Producto p : listaProductosEncontrados) {
                System.out.println("ID: "+p.getID());
                System.out.println("Nombre: "+p.getNombre());
                System.out.println("Stock: "+p.getCantidadEnStock());
                System.out.println("Precio: "+p.getPrecio());
            }
        }
    }
}