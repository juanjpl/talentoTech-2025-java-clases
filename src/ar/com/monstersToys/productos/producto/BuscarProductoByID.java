package ar.com.monstersToys.productos.producto;

import java.util.ArrayList;

public class BuscarProductoByID {
    public static ArrayList<Object> buscarProductoByID(ArrayList<Producto> listaProductos, String ID) {
        // TODO Auto-generated method stub
        ArrayList<Object> producto_encontrado_ID = new ArrayList<Object>(2);
        System.out.println("Vamos a buscar el producto con ID: " + ID);

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getID().equalsIgnoreCase(ID)) {
                producto_encontrado_ID.add(0, listaProductos.get(i));
                producto_encontrado_ID.add(1, i);
            }
        }

        if (producto_encontrado_ID.isEmpty()) {
            return null;
        } else {
            return producto_encontrado_ID;
        }
    }
}