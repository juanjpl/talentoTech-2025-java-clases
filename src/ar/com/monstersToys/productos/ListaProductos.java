package ar.com.monstersToys.productos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

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
        String nombre="Nuevo Producto";
        double precio = 0;
        int stock = 0;
        String fechaVencimiento="00/00/0000";


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


    public static void agregarProducto(ArrayList<Producto> listaProductos ) {
        // TODO Auto-generated method stub

        //categoria nuevoProducto= new categoria<>();

        Bebida cafe_americano = new Bebida("Americano", 1500, 2000, 250);
        Bebida cafe_expresso = new Bebida("Expresso", 2500, 3000, 150);
        Bebida cafe_frappe = new Bebida("Frappe", 3500, 4000, 200);

        Comida croissant = new Comida("Croissant", 1500, 2000, "10/01/2026");
        Comida pain_au_chocolat = new Comida("Pain au Chocolat", 2500, 3000, "20/01/2026");
        Comida croissant_nutella = new Comida("Croissant relleno de Nutella", 3500, 4000, "30/01/2026");

        listaProductos.add(cafe_americano);
        listaProductos.add(cafe_expresso);
        listaProductos.add(cafe_frappe);
        listaProductos.add(croissant_nutella);
        listaProductos.add(croissant);
        listaProductos.add(pain_au_chocolat);

        System.out.println("Se agregó el producto correctamente.");


    }

    public static void buscarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

        ArrayList<Producto> listaProductosEncontrados = new ArrayList<Producto>();

        System.out.println("Ingrese el producto a buscar:");


        Scanner sc = new Scanner(System.in);
        String productoBuscado = sc.next();

        System.out.println("Vamos a buscar: " + productoBuscado);

        for(Producto prod : listaProductos) {

            if(prod.getNombre().toLowerCase().contains(productoBuscado.toLowerCase())) {
                listaProductosEncontrados.add(prod);
            }
        }

        listaProductosEncontrados.forEach(System.out::println);


    }

    public static ArrayList<Object> buscarProductoByID(ArrayList<Producto> listaProductos, String ID) {
        // TODO Auto-generated method stub

        ArrayList<Object> producto_encontrado_ID = new ArrayList<>(2);

        System.out.println("Ingrese el ID del producto a actualizar:");
        Scanner sc = new Scanner(System.in);
        String productoBuscado = sc.next();
        System.out.println("Vamos a buscar: " + productoBuscado);

        for(int i =0; i<listaProductos.size();i++) {
            if(listaProductos.get(i).getID().toLowerCase().contains(productoBuscado)) {
                producto_encontrado_ID.add(0,listaProductos.get(i));
                producto_encontrado_ID.add(1,i);
            }
        }

       return producto_encontrado_ID;


    }

    public static void actualizarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub
        System.out.println("Ingrese el ID del producto a actualizar: ");
        Scanner sc = new Scanner(System.in);
        String id_producto_a_actualizar = sc.next();

        ArrayList<Object> producto_lista_actualizar = buscarProductoByID(listaProductos,id_producto_a_actualizar);

        System.out.println(producto_lista_actualizar);


        int  indice_encontrado = (int) producto_lista_actualizar.getLast();
        @SuppressWarnings("unchecked") // Suprime el warning de advertencia de tipos
        ArrayList<Producto> lista_producto_encontrado = (ArrayList<Producto>) producto_lista_actualizar.getFirst();

/*
        if(producto_lista_actualizar.isEmpty()) {
            System.out.println("No existe el producto con el identificador: " + producto_a_actualizar);
        }else{
            System.out.println("Se encontró el producto: "  + producto_lista_actualizar);
        }
        System.out.println("Ingrese el nombre del producto a actualizar: ");
        String nombre_a_actualizar= sc.nextLine();

        producto_lista_encontrado.setNombre(nombre_a_actualizar);
        System.out.println(producto_lista_actualizar.get(1));


        System.out.println("Ingrese el stock del producto a actualizar: ");
        int stock_a_actualizar= sc.nextInt();
        System.out.println("Ingrese el precio del producto a actualizar: ");
        int precio_a_actualizar= sc.nextInt();
        */

       // listaProductos.set((Integer) producto_lista_actualizar.get(1),producto_lista_actualizar.getFirst());





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
