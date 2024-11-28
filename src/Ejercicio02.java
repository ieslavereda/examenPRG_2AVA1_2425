public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println(sumaN(new int[]{0}, 1, 3));
        System.out.println(sumaNitera(new int[]{0}, 1, 3));

        System.out.println(sumaN(new int[]{0, 1, 2, 3, 4}, 1, 3));
        System.out.println(sumaNitera(new int[]{0, 1, 2, 3, 4}, 1, 3));

        System.out.println(sumaN(new int[]{1, 2, 3}, 1, 3));
        System.out.println(sumaNitera(new int[]{1, 2, 3}, 1, 3));

        System.out.println(sumaN(new int[]{}, 1, 3));
        System.out.println(sumaNitera(new int[]{}, 1, 3));

        System.out.println(sumaN(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1, 0));
        System.out.println(sumaNitera(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1, 0));

        System.out.println(sumaN(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1, 11));
        System.out.println(sumaNitera(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1, 11));

        System.out.println(sumaN(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 1));
        System.out.println(sumaNitera(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 1));

        System.out.println(sumaN(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4, 2));
        System.out.println(sumaNitera(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4, 2));

        System.out.println(sumaN(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4, 4));
        System.out.println(sumaNitera(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4, 4));
    }


    public static int sumaN(int[] array, int ini, int rango) {
//        if(ini>=array.length || ini>(rango+ini-1))
//            return 0;
//        if(ini==(rango+ini-1))
//            return array[ini];

        if (ini >= array.length || rango == 0)
            return 0;

        return array[ini] + sumaN(array, ++ini, --rango);
    }

    public static int sumaNitera(int[] array, int ini, int rango) {
        int tamanyo = Math.min((ini + rango - 1), (array.length - 1));
        int suma = 0;
        for (int i = ini; i <= tamanyo; i++) {
            suma += array[i];
        }
        return suma;
    }

}
