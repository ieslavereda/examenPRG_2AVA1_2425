import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(obtenerCoordenadaRecursivo("Introduce una coordenada:")));
        System.out.println(Arrays.toString(obtenerCoordenadaIterativo("Introduce una coordenada:")));

    }

    private static char[] obtenerCoordenadaRecursivo(String texto) {

        Scanner sc = new Scanner(System.in);

        System.out.println(texto);
        String coord = sc.nextLine().toUpperCase();

        if (coord.length() != 2)
            return obtenerCoordenadaRecursivo("Debes introducir 2 caracteres. Introduce una coordenada:");
        if (coord.charAt(0) < '1' || coord.charAt(0) > '8')
            return obtenerCoordenadaRecursivo("El primer carácter debe estar entre 1 y 8. Introduce una coordenada:");
        if (coord.charAt(1) < 'A' || coord.charAt(1) > 'H')
            return obtenerCoordenadaRecursivo("El segundo carácter debe estar entre A y H. Introduce una coordenada:");

        return new char[]{coord.charAt(0), coord.charAt(1)};

    }

    private static char[] obtenerCoordenadaIterativo(String texto) {

        Scanner sc = new Scanner(System.in);
        boolean correcto;
        String coord;

        do {
            System.out.println(texto);
            correcto = true;
            coord = sc.nextLine().toUpperCase();

            if (coord.length() != 2) {
                System.out.print("Debes introducir 2 caracteres. ");
                correcto = false;
            } else if (coord.charAt(0) < '1' || coord.charAt(0) > '8') {
                System.out.print("El primer carácter debe estar entre 1 y 8. ");
                correcto = false;
            } else if (coord.charAt(1) < 'A' || coord.charAt(1) > 'H') {
                System.out.print("El segundo carácter debe estar entre A y H. ");
                correcto = false;
            }

        } while (!correcto);

        return new char[]{coord.charAt(0), coord.charAt(1)};
    }
}

