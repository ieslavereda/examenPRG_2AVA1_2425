public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println(sumaN(new int[]{0},1,3));
        System.out.println(sumaNitera(new int[]{0},1,3));

        System.out.println(sumaN(new int[]{0,1,2,3,4},1,3));
        System.out.println(sumaNitera(new int[]{0,1,2,3,4},1,3));

        System.out.println(sumaN(new int[]{1,2,3},1,3));
        System.out.println(sumaNitera(new int[]{1,2,3},1,3));

        System.out.println(sumaN(new int[]{},1,3));
        System.out.println(sumaNitera(new int[]{},1,3));

        System.out.println(sumaN(new int[]{1,2,3,4,5,6,7,8},1,0));
        System.out.println(sumaNitera(new int[]{1,2,3,4,5,6,7,8},1,0));

        System.out.println(sumaN(new int[]{1,2,3,4,5,6,7,8},1,11));
        System.out.println(sumaNitera(new int[]{1,2,3,4,5,6,7,8},1,11));

        System.out.println(sumaN(new int[]{1,2,3,4,5,6,7,8},11,1));
        System.out.println(sumaNitera(new int[]{1,2,3,4,5,6,7,8},11,1));

    }


    public static int sumaN(int[] array, int ini, int rango){
        if(ini>=array.length || ini>rango)
            return 0;
        if(ini==rango)
            return array[ini];
        return array[ini]+sumaN(array, ++ini, rango);
    }

    public static int sumaNitera(int[] array, int ini, int rango){
        int tamanyo = Math.min(rango, (array.length - 1));
        int suma = 0;
        for (int i = ini; i <= tamanyo; i++) {
            suma += array[i];
        }
        return suma;
    }

}
