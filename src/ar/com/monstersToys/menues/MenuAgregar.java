package ar.com.monstersToys.menues;

import ar.com.monstersToys.productos.bebida.AgregarBebida;
import ar.com.monstersToys.productos.comida.AgregarComida;
import ar.com.monstersToys.productos.producto.AgregarProductosBasicos;
import ar.com.monstersToys.productos.producto.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAgregar {


    public static void imprimirMenuAgregar(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        int salidaMenu = 0;

        Scanner sc = new Scanner(System.in);

        while(salidaMenu != 4) {
            System.out.println("Elija la opción correspondiente: ");
            System.out.println("(1) Agregar Bebida");
            System.out.println("(2) Agregar Comida");
            System.out.println("(3) Agregar Lista Productos Basicos");
            System.out.println("(4) Volver");

            salidaMenu = Integer.parseInt(sc.nextLine());

            switch (salidaMenu) {
                case 1:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Agregaremos una bebidaa a la lista");
                    AgregarBebida.agregarBebida(listaProductos);

                    break;
                case 2:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Agregaremos una comida a la lista");
                    AgregarComida.agregarComida(listaProductos);

                    break;
                case 3:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Agregaremos una lista de productos básicos.");
                    AgregarProductosBasicos.agregarProducto( listaProductos);
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
