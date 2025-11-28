package ar.com.monstersToys.clientes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clientes {

    private String nombre;
    private String email;

    // Patrón de expresión regular para validar el formato básico de un email
    // ^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$
    // ^: Inicio de la cadena
    // [^\\s@]+: Uno o más caracteres que no sean espacios en blanco ni @
    // @: El carácter @
    // [^\\s@]+: Uno o más caracteres que no sean espacios en blanco ni @ (nombre del dominio)
    // \\.: El punto que separa el dominio del TLD
    // [^\\s@]+: Uno o más caracteres que no sean espacios en blanco ni @ (TLD)
    // $: Fin de la cadena
    private static final String EMAIL_REGEX = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);


    public static boolean esEmailValido(String correo) {
        if (correo == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }


    // Constructor
    public Clientes(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if(esEmailValido(email)) {
            this.email = email;
        }else {
            this.email="El correo ingresado no tiene el formato necesario";
        }

    }


    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", email=" + email + "]";
    }





}