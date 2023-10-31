package es.ieslavereda.tools;

public class Array {

    public static void fill(int[] array){
        for(int i=0;i<array.length;i++)
            array[i] = (int)(Math.random()*1000000);
    }


    public static void swap(int[] array, int i, int j) {

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;

    }
    public static void swap(String[] array, int i, int j) {

        String aux = array[i];
        array[i] = array[j];
        array[j] = aux;

    }
}
