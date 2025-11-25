package ar.com.techlab.clase003;

import java.util.Scanner;

public class Practica03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su usuario");
        String ingreseUsuario = scanner.nextLine();

        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre es: "+ingreseUsuario+ " y tu edad es: "+edad);
        //para dejar de usar recursos del sistema
        scanner.close();
    }
}
