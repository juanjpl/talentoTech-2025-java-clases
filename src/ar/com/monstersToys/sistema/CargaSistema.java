package ar.com.monstersToys.sistema;

import java.util.Scanner;

public class CargaSistema {
    public static String cargaSistema() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de Almacén!");
        System.out.println("Ingrese su nombre por favor:");

        String usuario = sc.nextLine();

        System.out.println("Gracias " + usuario);
        System.out.println("Ahora selecciona una opción del menú:");

        return usuario;
    }
}
