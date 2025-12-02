package ar.com.monstersToys.productos.producto;

import java.util.ArrayList;

public class ListarProductos {

    public static void listarProductos(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        if (listaProductos.isEmpty()) {
            System.out.printf("==================================================%n");
            System.out.printf("                Lista Vacia %n");
            System.out.printf("==================================================%n");

        }else{
            System.out.printf("===========================================================================================================%n");
            System.out.printf("                             Lista Productos Almacen %n");
            System.out.printf("===========================================================================================================%n");
            System.out.printf ( "| %-36s | %-30s | %-10s | %-10s |%n","ID", "NOMBRE", "STOCK", "PRECIO" );
            System.out.printf("-----------------------------------------------------------------------------------------------------------%n" );
            for(Producto p : listaProductos) {

                System.out.printf ( "| %-36s | %-30s | %-10d | %-2f |%n",p.getID(), p.getNombre(), p.getCantidadEnStock(), p.getPrecio() );

            }
        }
    }
}
