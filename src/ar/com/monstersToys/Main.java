package ar.com.monstersToys;

import ar.com.monstersToys.menues.MenuInicio;
import ar.com.monstersToys.productos.ProductoDos;
import ar.com.monstersToys.sistema.CargaSistema;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Aquíe
        ArrayList<ProductoDos> listaProductos = new ArrayList<ProductoDos>();

        // 1) Creamos un usuario
        String usuario = CargaSistema.cargaSistema();


        // 2) Mostramos el menu de opciones
        MenuInicio.imprimirMenuPrincipal( listaProductos);


    }
}
