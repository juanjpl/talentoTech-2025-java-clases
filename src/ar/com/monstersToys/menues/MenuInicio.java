package ar.com.monstersToys.menues;

import ar.com.monstersToys.productos.ProductoDos;
import ar.com.monstersToys.productos.Productos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInicio {

    public static void imprimirMenuPrincipal(ArrayList<ProductoDos> listaProductos) {

        Scanner sc = new Scanner(System.in);
        int salidaMenu = 0;

        while (salidaMenu != 7) {

            System.out.println("Seleccionó la opción a ejecutar");
            System.out.println("(1) Agregar Productos");
            System.out.println("(2) Listar Productos");
            System.out.println("(3) Buscar/Actualizar Productos");
            System.out.println("(4) Eliminar Productos");
            System.out.println("(5) Crear un Pedido");
            System.out.println("(6) Listar Pedidos");
            System.out.println("(7) Salir");

            salidaMenu = sc.nextInt();

            switch (salidaMenu) {
                case 1:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Agregaremos un producto nuevo a la lista");
                    MenuAgregar.imprimirMenuAgregar(listaProductos);

                    break;
                case 2:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Imprimiremos todos los productos de la lista: ");
                    Productos.listarProductos(listaProductos);
                    break;
                case 3:
                    System.out.println("Seleccionó " + salidaMenu);
                    MenuBuscar.imprimirMenuBuscar(listaProductos);
                    break;
                case 4:
                    System.out.println("Seleccionó " + salidaMenu);
                    Productos.eliminarProducto(listaProductos);
                    break;
                case 5:
                    System.out.println("Seleccionó " + salidaMenu);
                    break;
                case 6:
                    System.out.println("Seleccionó " + salidaMenu);
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("La opcion ingresada no está dentro del menú.");

            }

        }
    }
}
