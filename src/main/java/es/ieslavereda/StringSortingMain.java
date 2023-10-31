package es.ieslavereda;

import static es.ieslavereda.algorithms.iterative.Bubble.sort;
import static es.ieslavereda.tools.Display.mostrar;

public class StringSortingMain {
    public static void main(String[] args) {

        //int[] array = new int[]{5,3,78,9,4,2};
        String[] array = new String[]{"coche","moto","zoo","casa","melon"};

        sort(array);

        mostrar(array);
    }
}
