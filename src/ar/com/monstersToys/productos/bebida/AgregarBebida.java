package ar.com.monstersToys.productos.bebida;

import ar.com.monstersToys.productos.producto.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarBebida {
    public static void agregarBebida(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String nombre_a_agregar;
        int precio_a_agregar = 0;
        int stock_a_agregar = 0;
        int volumen_a_agregar = 0;


        System.out.println("Ingrese el nombre del nuevo producto:");
        nombre_a_agregar = sc.nextLine();

        System.out.println("Ingrese el precio del nuevo producto:");
        precio_a_agregar = sc.nextInt();

        System.out.println("Ingrese el stock del nuevo producto:");
        stock_a_agregar = sc.nextInt();

        System.out.println("Ingrese el volumen del nuevo producto:");
        volumen_a_agregar = sc.nextInt();


        Bebida nuevoProducto = new Bebida(nombre_a_agregar, precio_a_agregar, stock_a_agregar, volumen_a_agregar);

        System.out.println("El nuevo producto agregado es:");
        listaProductos.add(nuevoProducto);

        System.out.println("Se agregó el producto correctamente.");


    }
}