package ar.com.monstersToys.productos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProductos {

    public static void listarProductos(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        for(Producto p : listaProductos) {
            System.out.println(p.getNombre());
            System.out.println(p.getCantidadEnStock());
            System.out.println(p.getPrecio());
            System.out.println(p.getID());
        }
    }

    public static void agregarBebida(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String nombre="";
        int precio = 0;
        int stock = 0;
        int volumen = 0;


        System.out.println("Ingrese el nombre del nuevo producto:");
        nombre = sc.next();

        System.out.println("Ingrese el precio del nuevo producto:");
        precio = sc.nextInt();

        System.out.println("Ingrese el nombre del nuevo producto:");
        stock = sc.nextInt();

        System.out.println("Ingrese el nombre del nuevo producto:");
        volumen = sc.nextInt();


        Bebida nuevoProducto = new Bebida(nombre, precio, stock, volumen);


        listaProductos.add(nuevoProducto);

        System.out.println("Se agregó el producto correctamente.");



    }

    public static void agregarComida(ArrayList<Producto> listaProductos)  {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String nombre;
        double precio = 0;
        int stock = 0;
        String fechaVencimiento;


        System.out.println("Ingrese el nombre del nuevo producto:");
        nombre = sc.next();

        System.out.println("Ingrese el precio del nuevo producto:");
        precio = sc.nextDouble();

        System.out.println("Ingrese el nombre del nuevo producto:");
        stock = sc.nextInt();

        System.out.println("Ingrese el nombre del nuevo producto:");
        fechaVencimiento = sc.next();


        Comida nuevoProducto = new Comida(nombre, precio, stock, fechaVencimiento);


        listaProductos.add(nuevoProducto);

        System.out.println("Se agregó el producto correctamente.");



    }


    public static void agregarProducto(ArrayList<Producto> listaProductos , String cateogria) {
        // TODO Auto-generated method stub

        //categoria nuevoProducto= new categoria<>();

        Bebida teBlanco = new Bebida("Te Blanco", 1500, 2000, 150);
        Bebida teNegro = new Bebida("Te Negro", 2500, 3000, 2000);
        Bebida teRojo = new Bebida("Te Rojo", 3500, 4000, 250);

        listaProductos.add(teBlanco);
        listaProductos.add(teNegro);
        listaProductos.add(teRojo);

        System.out.println("Se agregó el producto correctamente.");


    }

    public static void buscarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

        ArrayList<Producto> listaProductosEncontrados = new ArrayList<Producto>();
        String productoBuscado;

        System.out.println("Ingrese el producto a buscar:");


        Scanner sc = new Scanner(System.in);
        productoBuscado = sc.next();

        System.out.println("Vamos a buscar: " + productoBuscado);

        for(Producto prod : listaProductos) {

            if(prod.getNombre().toLowerCase().contains(productoBuscado.toLowerCase())) {
                listaProductosEncontrados.add(prod);
            }
        }

        listaProductosEncontrados.forEach(System.out::println);


    }

    public static void actualizarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        System.out.println("actualizando  producto......");
    }




    public static void eliminarProducto(ArrayList<Producto> listaProductos) {

        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String eliminarProducto="";
        int indiceEliminar =0;

        Producto productoEncontrado = new Producto();

        System.out.println("Eliminaremos un producto");
        System.out.println("Ingrese el nombre o Id a eliminar:");
        eliminarProducto = sc.next().trim();

        System.out.println("Buscaremos el producto:....");
        System.out.println(eliminarProducto);


        for(Producto prod : listaProductos) {


            if(prod.getNombre().toLowerCase().contains(eliminarProducto) == true) {

                productoEncontrado = prod;
                System.out.println("Encontramos el producto a eliminar.");
                indiceEliminar = listaProductos.indexOf(prod);
                //System.out.println(productoEncontrado);
                //System.out.println(indiceEliminar);

                listaProductos.remove(indiceEliminar);



            }	else {
                System.out.println("No encontramos el producto a eliminar.");
            }
        }

        System.out.println("Hemos eliminado el producto de la lista. Ahora imprimimos la lista final.");
        listaProductos.toString();

    }
}
