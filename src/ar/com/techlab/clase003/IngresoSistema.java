package ar.com.techlab.clase003;
import java.util.Scanner;

public class IngresoSistema {

    public static void main(String[] args) {


    final String USUARIO_DB = "root";
    final String CLAVE_DB = "admin";
    // nos sirve para cargar datos desde la consola
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre de usuario: ");
    String nombreUsuario = scanner.nextLine();

    System.out.println("Ingrese su nombre de contraseña: ");
    String claveUsuario = scanner.nextLine();

    // "admin" con equals se fija que sea el mismo valor de string
    if (USUARIO_DB.equalsIgnoreCase(nombreUsuario) && CLAVE_DB.equals(claveUsuario)) {
        System.out.println("Login correcto a la aplicacion");
    } else {
        System.out.println("Credenciales incorrectas");
    }

    // para dejar de usar recursos del sistema
    scanner.close();
}
}
