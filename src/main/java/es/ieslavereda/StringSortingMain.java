package es.ieslavereda;

import static es.ieslavereda.algorithms.iterative.Bubble.sort;
import static es.ieslavereda.tools.Display.mostrar;

public class StringSortingMain {
    public static void main(String[] args) {

        String[] array = new String[]{"coche","moto","zoo","casa","melon"};

        sort(array);

        mostrar(array);
    }
}
