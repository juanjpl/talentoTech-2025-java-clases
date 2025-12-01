package ar.com.monstersToys.productos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class ListaProductos {

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

    public static void agregarComida(ArrayList<Producto> listaProductos)  {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String nombre="Nuevo Producto";
        double precio = 0;
        int stock = 0;
        String fechaVencimiento="00/00/0000";


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

        System.out.println("Ingrese el ID del producto a buscar o su nombre:");


        Scanner sc = new Scanner(System.in);
        String productoBuscado = sc.nextLine();

        System.out.println("Vamos a buscar: " + productoBuscado);

        for(Producto prod : listaProductos) {

            if(prod.getNombre().equalsIgnoreCase(productoBuscado) || prod.getID().equalsIgnoreCase(productoBuscado)) {
                listaProductosEncontrados.add(prod);
            }
        }


        if(listaProductosEncontrados.isEmpty()) {
            System.out.println("No existe el producto buscado.");
        }else  {
            System.out.println(listaProductosEncontrados.getFirst());
        }


    }

    public static ArrayList<Object> buscarProductoByID(ArrayList<Producto> listaProductos, String ID) {
        // TODO Auto-generated method stub

        ArrayList<Object> producto_encontrado_ID = new ArrayList<>(2);

        System.out.println("Vamos a buscar el producto con ID: " + ID);

        for(int i =0; i<listaProductos.size();i++) {
            if(listaProductos.get(i).getID().equalsIgnoreCase(ID)) {
                producto_encontrado_ID.add(0,listaProductos.get(i));
                producto_encontrado_ID.add(1,i);
            }
        }
if(producto_encontrado_ID.isEmpty()) {
    return null;
}else{
    return producto_encontrado_ID;
}



    }

    public static void actualizarProducto(ArrayList<Producto> listaProductos) {

        System.out.println("Ingrese el ID del producto a actualizar: ");
        Scanner sc = new Scanner(System.in);
        String id_producto_a_actualizar = sc.nextLine();

        ArrayList<Object> producto_lista_actualizar = buscarProductoByID(listaProductos,id_producto_a_actualizar);

        int  indice_encontrado = (int) producto_lista_actualizar.getLast();
        Producto lista_producto_encontrado = (Producto) producto_lista_actualizar.getFirst();

        if(producto_lista_actualizar.isEmpty()) {
            System.out.println("No se ha encontrado ningun producto con ese ID");
        }else {
            System.out.println("Se ha encontrado el producto.");

            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.printf("| %-36s | %-30s | %-10s | %-10s |%n", "ID", "NOMBRE", "STOCK", "PRECIO");
            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.printf("| %-36s | %-30s | %-10d | %-2f |%n", lista_producto_encontrado.getID(), lista_producto_encontrado.getNombre(), lista_producto_encontrado.getCantidadEnStock(), lista_producto_encontrado.getPrecio());


            System.out.println("Ingrese el nombre del producto a actualizar: ");
            String nombre_a_actualizar = sc.nextLine();
            System.out.println("Ingrese el stock del producto a actualizar: ");
            int stock_a_actualizar = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el precio del producto a actualizar: ");
            Double precio_a_actualizar = Double.parseDouble(sc.nextLine());



            System.out.printf("===========================================================================================================%n");
            System.out.printf("                             Actualizaciòn de Producto %n");
            System.out.printf("===========================================================================================================%n");
            System.out.println("| PRODUCTO ACTUAL |");
            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.printf("| %-36s | %-30s | %-10s | %-10s |%n", "ID", "NOMBRE", "STOCK", "PRECIO");
            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.printf("| %-36s | %-30s | %-10d | %-2f |%n", lista_producto_encontrado.getID(), lista_producto_encontrado.getNombre(), lista_producto_encontrado.getCantidadEnStock(), lista_producto_encontrado.getPrecio());

            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.println("| PRODUCTO Actualizado |");
            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.printf("| %-36s | %-30s | %-10s | %-10s |%n", "ID", "NOMBRE", "STOCK", "PRECIO");
            System.out.printf("-----------------------------------------------------------------------------------------------------------%n");
            System.out.printf("| %-36s | %-30s | %-10d | %-2f |%n", lista_producto_encontrado.getID(), nombre_a_actualizar, stock_a_actualizar, precio_a_actualizar);

            System.out.println("Deseas actualizar el Producto? SI/NO");
            String opcion = sc.nextLine();

            System.out.println(opcion);

        }


            /*
            if (respuesta_actualizar.equalsIgnoreCase("SI")) {
                System.out.println("El Producto Fuè actualizado Exitosamente!");
            } else if (respuesta_actualizar.equalsIgnoreCase("NO")) {
                System.out.println("El Producto No fuè actualizado.");
            } else {
                System.out.println("No existe la opciòn!");

            }

            /*
            while(respuesta_actualizar.equalsIgnoreCase("SI")) {

               if (respuesta_actualizar.equalsIgnoreCase("SI")) {
                   System.out.println("El Producto Fuè actualizado Exitosamente!");
               } else if (respuesta_actualizar.equalsIgnoreCase("NO")) {
                   System.out.println("El Producto No fuè actualizado.");
               } else {
                   System.out.println("No existe la opciòn!");

               }

               System.out.println("Deseas actualizar el Producto? SI/NO");
               respuesta_actualizar = sc.nextLine().toLowerCase();

           };

             */

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
