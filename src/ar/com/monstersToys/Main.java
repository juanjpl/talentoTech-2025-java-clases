package ar.com.monstersToys;

import ar.com.monstersToys.menues.MenuInicio;
import ar.com.monstersToys.productos.producto.Producto;
import ar.com.monstersToys.sistema.CargaSistema;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Aquí simulamos una base de datos DB
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();

        // 1) Creamos un usuario
        String usuario = CargaSistema.cargaSistema();

        // 2) Mostramos el menu de opciones
        MenuInicio.imprimirMenuPrincipal(listaProductos);


    }
}
