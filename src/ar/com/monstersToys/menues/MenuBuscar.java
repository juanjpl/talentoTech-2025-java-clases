package ar.com.monstersToys.menues;

import ar.com.monstersToys.productos.producto.ActualizarProducto;
import ar.com.monstersToys.productos.producto.BuscarProducto;
import ar.com.monstersToys.productos.producto.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBuscar {
    public static void imprimirMenuBuscar(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        int salidaMenu = 0;
        Scanner sc = new Scanner(System.in);

        while(salidaMenu != 3) {
            System.out.println("Elija la opción correspondiente: ");
            System.out.println("(1) Buscar Producto");
            System.out.println("(2) Actualizar Producto");
            System.out.println("(3) Salir");
            salidaMenu = Integer.parseInt(sc.nextLine());

            switch (salidaMenu) {
                case 1:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Buscaremos un producto de la lista");
                    BuscarProducto.buscarProducto( listaProductos);

                    break;
                case 2:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Actualizaremos un producto de la lista.");
                    ActualizarProducto.actualizarProducto( listaProductos);
                    break;
                case 3:
                    System.out.println("Volvemos al Menú Principal");
                    break;

                default:
                    System.out.println("La opcion ingresada no está dentro del menú.");

            }
        }


    }
}
