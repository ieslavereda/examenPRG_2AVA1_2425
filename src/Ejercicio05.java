import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        int[] array = new int[9];
        rellenarArray(array);
        System.out.println(Arrays.toString(array));
        invertirArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void rellenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10)+1;
        }
    }

    public static void invertirArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int aux = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = aux;
        }
    }


}
