package ar.com.monstersToys.productos.producto;

import ar.com.monstersToys.productos.bebida.Bebida;
import ar.com.monstersToys.productos.comida.Comida;

import java.util.ArrayList;

public class AgregarProductosBasicos {
    public static void agregarProducto(ArrayList<Producto> listaProductos) {
        // TODO Auto-generated method stub

        if(listaProductos.isEmpty()) {
            listaProductos.add(new Bebida("Americano", 1500, 2000, 250));
            listaProductos.add(new Bebida("Expresso", 2500, 3000, 150));
            listaProductos.add(new Bebida("Frappe", 3500, 4000, 200));

            listaProductos.add(new Comida("Croissant", 1500, 2000, "10/01/2026"));
            listaProductos.add(new Comida("Pain au Chocolat", 2500, 3000, "20/01/2026"));
            listaProductos.add(new Comida("Croissant relleno de Nutella", 3500, 4000, "30/01/2026"));

            System.out.println("Se agregaron los productos correctamente.");
        }

    }
}