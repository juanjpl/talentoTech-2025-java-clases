package ar.com.monstersToys.utilidades;

public class limpiarPantalla {
    public static void limpiarPantalla() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Limpiar pantalla en Windows
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                pb.inheritIO().start().waitFor();
            } else {
                // Limpiar pantalla en Unix/Linux/macOS (funciona si la terminal es compatible)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
        }
    }

}
