package ar.com.monstersToys.menues;

import ar.com.monstersToys.productos.Producto;
import ar.com.monstersToys.productos.ListaProductos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAgregar {

    public static void buscarActualizarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

    }



    public static void imprimirMenuAgregar(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        int salidaMenu = 0;

        Scanner sc = new Scanner(System.in);

        while(salidaMenu != 4) {
            System.out.println("Elija la opción correspondiente: ");
            System.out.println("(1) Agregar Bebida");
            System.out.println("(2) Agregar Comida");
            System.out.println("(3) Agregar Lista Productos");
            System.out.println("(4) Volver");

            salidaMenu = sc.nextInt();

            switch (salidaMenu) {
                case 1:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Agregaremos una bebidaa a la lista");
                    ListaProductos.agregarBebida( listaProductos);

                    break;
                case 2:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("BAgregaremos una comida a la lista");
                    ListaProductos.agregarComida( listaProductos);

                    break;
                case 3:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("IActualizaremos un producto de la lista.");
                    ListaProductos.agregarProducto( listaProductos, "Bebida");
                    break;
                case 4:
                    System.out.println("Volvemos al Menú Principal");
                    break;

                default:
                    System.out.println("La opcion ingresada no está dentro del menú.");

            }
        }


    }
}
