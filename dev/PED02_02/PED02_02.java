import java.util.Scanner;

public class PED02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al programa de cálculo del máximo (el número mayor de los dos)!");
        
        // Lee el primer número
        System.out.print("Por favor, introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Lee el segundo número
        System.out.print("Por favor, introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcula el número mayor
        int maximo;
        if (numero1 > numero2) {
            maximo = numero1;
        } else {
            maximo = numero2;
        }

        // Imprime el resultado
        System.out.println("El número máximo entre " + numero1 + " y " + numero2 + " es: " + maximo);
        System.out.println("¡Gracias por usar el programa! ¡Hasta pronto!");

        // Espera a que el usuario presione Enter para salir
        System.out.println("\nPresiona Enter para salir...");
        try {
            System.in.read(); // Espera a que el usuario presione Enter
        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer la entrada: " + e.getMessage());
        }

        scanner.close(); // Cierra el Scanner
    }
}
