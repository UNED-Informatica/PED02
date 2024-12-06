public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola! Este es mi primer programa.\n" +
                           "Nombre: Tabea Hirzel\n" +
                           "Edad: 47 años\n" +
                           "¡Un saludo desde mi primer programa!\n\n" +
                           "Presiona Enter para salir...");

        try {
            System.in.read(); // Espera a que el usuario presione Enter
        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer la entrada: " + e.getMessage());
        }
    }
}
