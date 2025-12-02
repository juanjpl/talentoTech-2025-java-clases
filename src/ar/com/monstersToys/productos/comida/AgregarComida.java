package ar.com.monstersToys.productos.comida;

import ar.com.monstersToys.productos.producto.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarComida {
    public static void agregarComida(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String nombre = "Nuevo Producto";
        double precio = 0;
        int stock = 0;
        String fechaVencimiento = "00/00/0000";


        System.out.println("Ingrese el nombre del nuevo producto:");
        nombre = sc.nextLine();

        System.out.println("Ingrese el precio del nuevo producto:");
        precio = sc.nextDouble();

        System.out.println("Ingrese el stock del nuevo producto:");
        stock = sc.nextInt();

        System.out.println("Ingrese el vencimiento del nuevo producto:");
        fechaVencimiento = sc.nextLine();


        Comida nuevoProducto = new Comida(nombre, precio, stock, fechaVencimiento);


        listaProductos.add(nuevoProducto);

        System.out.println("Se agregó el producto correctamente.");


    }
}