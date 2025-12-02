package ar.com.monstersToys.menues;

import ar.com.monstersToys.productos.producto.ActualizarProducto;
import ar.com.monstersToys.productos.producto.EliminarProducto;
import ar.com.monstersToys.productos.producto.Producto;
import ar.com.monstersToys.productos.producto.ListarProductos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInicio {

    public static void imprimirMenuPrincipal(ArrayList<Producto> listaProductos) {

        Scanner sc = new Scanner(System.in);
        int salidaMenu = 0;

        while (salidaMenu != 7) {

            System.out.println("Seleccionó la opción a ejecutar");
            System.out.println("(1) Agregar Productos");
            System.out.println("(2) Listar Productos");
            System.out.println("(3) Buscar Productos");
            System.out.println("(4) Actualizar Productos (Busqueda Exacta)");
            System.out.println("(5) Eliminar Productos");
            System.out.println("(6) Crear un Pedido");
            System.out.println("(7) Listar Pedidos");
            System.out.println("(8) Salir");

            salidaMenu = sc.nextInt();


            switch (salidaMenu) {
                case 1:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Agregaremos un producto nuevo a la lista");
                    MenuAgregar.imprimirMenuAgregar(listaProductos);
                    break;
                case 2:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Listaremos todos los productos de la lista: ");
                    ListarProductos.listarProductos(listaProductos);
                    break;
                case 3:
                    System.out.println("Seleccionó " + salidaMenu);
                    MenuBuscar.imprimirMenuBuscar(listaProductos);
                    break;
                case 4:
                    System.out.println("Seleccionó " + salidaMenu);
                    ActualizarProducto.actualizarProducto(listaProductos);
                    break;
                case 5:
                    System.out.println("Seleccionó " + salidaMenu);
                    EliminarProducto.eliminarProducto(listaProductos);
                    break;
                case 6:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Creando un Pedido");
                    break;
                case 7:
                    System.out.println("Seleccionó " + salidaMenu);
                    System.out.println("Lista de productos del Pedido");
                    break;
                case 8:
                    System.out.println("Gracias por usar nuestro sistema");
                    MenuInicio.imprimirMenuPrincipal(listaProductos);
                    break;
                default:
                    System.out.println("La opcion ingresada no está dentro del menú.");
            }
        }
    }
}
