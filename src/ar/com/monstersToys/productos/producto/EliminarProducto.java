package ar.com.monstersToys.productos.producto;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarProducto {
    public static void eliminarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String eliminarProducto = "";
        int indiceEliminar = 0;

        Producto productoEncontrado ;

        System.out.println("Eliminaremos un producto");
        System.out.println("Ingrese el nombre o Id a eliminar:");
        eliminarProducto = sc.next().trim();

        System.out.println("Buscaremos el producto:....");
        System.out.println(eliminarProducto);

        for (Producto prod : listaProductos) {
            if (prod.getNombre().toLowerCase().contains(eliminarProducto)) {

                productoEncontrado = prod;
                System.out.println("Encontramos el producto a eliminar.");
                indiceEliminar = listaProductos.indexOf(prod);
                listaProductos.remove(indiceEliminar);

            } else {
                System.out.println("No encontramos el producto a eliminar.");
            }
        }

        System.out.println("Hemos eliminado el producto de la lista. Ahora imprimimos la lista final.");
    }
}