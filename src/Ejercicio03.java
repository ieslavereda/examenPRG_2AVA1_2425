import java.util.Arrays;

public class Ejercicio03 {

    public static void main(String[] args) {

        String[][] partes = new String[][]{
                {"Juan", "Pedro", "Carlos", "Jose", "Vane", "Jenni", "Lore"},
                {"3", "5", "10", "0", "1", "10", "4"}
        };

        // a
        System.out.println("Media de partes: " + mediaPartes(partes));

        // b
        System.out.println("Nombres con mas partes: " + nombresConMasPartes(partes));
        System.out.println("Nombres con mas partes: " + Arrays.toString(nombresConMasPartesArray(partes)));
        System.out.println("Nombres con mas partes: " + Arrays.toString(nombresConMasPartesArray2(partes)));


        // c
        System.out.println("Posicion de Jenni: " + encontrar(partes,"Jenni"));
        System.out.println("Posicion de Tomas: " + encontrar(partes,"Tomas"));

        //d
        System.out.println("Partes de Jenni: " + partesDe(partes, "Jenni"));
        System.out.println("Partes de Tomas: " + partesDe(partes, "Tomas"));

    }

    // a
    private static float mediaPartes(String[][] partes) {
        int cantidad = 0;

        for (int i = 0; i < partes[0].length; i++)
            cantidad += Integer.parseInt(partes[1][i]);

        return cantidad / (float) (partes[0].length);
    }

    // b
    private static String nombresConMasPartes(String[][] partes) {
        return nombresConPartes(partes, maxCantidadPartes(partes));
    }

    private static String[] nombresConMasPartesArray(String[][] partes) {
        String nombres = nombresConPartes(partes, maxCantidadPartes(partes));
        return nombres.split(" ");
    }

    private static String[] nombresConMasPartesArray2(String[][] partes) {
        String[] alumnosMaxPartes = new String[contarAlumnosConMaximosPartes(partes, maxCantidadPartes(partes))];
        nombresConPartes(partes, maxCantidadPartes(partes), alumnosMaxPartes);
        return alumnosMaxPartes;
    }

    private static int contarAlumnosConMaximosPartes(String[][] partes, int cantidadPartes){
        int cantidad = 0;

        for (int i = 0; i < partes[1].length; i++)
            if (Integer.parseInt(partes[1][i]) == cantidadPartes)
                cantidad++;

        return cantidad;
    }

    private static void nombresConPartes(String[][] partes, int cantidadPartes, String[] alumnosMaxPartes) {
        int cont=0;
        for (int i = 0; i < partes[1].length; i++)
            if (Integer.parseInt(partes[1][i]) == cantidadPartes)
                alumnosMaxPartes[cont++] = partes[0][i];
    }

    private static String nombresConPartes(String[][] partes, int cantidadPartes) {
        String nombres = "";

        for (int i = 0; i < partes[1].length; i++)
            if (Integer.parseInt(partes[1][i]) == cantidadPartes)
                nombres += partes[0][i] + " ";

        return nombres;
    }

    private static int maxCantidadPartes(String[][] partes) {

        int maximo = Integer.parseInt(partes[1][0]);

        for (int i = 1; i < partes[1].length; i++)
            if (Integer.parseInt(partes[1][i]) > maximo)
                maximo = Integer.parseInt(partes[1][i]);

        return maximo;
    }

    // c
    private static int encontrar(String[][] partes, String nombre) {

        boolean encontrado = false;
        int i = 0;
        do {

            if (partes[0][i].equals(nombre)) encontrado = true;
            else i++;

        } while (i < partes[0].length && !encontrado);

        return (encontrado) ? i : -1;
    }

    // d
    private static String partesDe(String[][] partes, String nombre) {

        int posicion = encontrar(partes, nombre);

        if (posicion == -1) return "No se encuentra " + nombre + " en el array.";

        return partes[1][posicion];
    }

}
