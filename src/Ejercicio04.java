import java.util.Arrays;

public class Ejercicio04 {
    public static void main(String[] args) {
        int[][] matriz = dibujaCruz(5);
        for (int[] array:matriz)
            System.out.println(Arrays.toString(array));
        matriz = dibujaCruz(6);
        for (int[] array:matriz)
            System.out.println(Arrays.toString(array));
    }

    public static int[][] dibujaCruz(int numero){
        int[][] matriz = new int[numero][numero];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j || j==matriz.length-i-1)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }
        return matriz;
    }

}
