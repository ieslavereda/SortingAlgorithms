package es.ieslavereda;


import es.ieslavereda.algorithms.iterative.*;

import static es.ieslavereda.tools.Array.fill;

public class NumberSortingMain {
    public static void main(String[] args) {

        int[] sizes = new int[]{100000,200000,300000,400000,500000,600000,700000,800000,900000,1000000,1100000,1200000,1300000,1400000,1500000};
        int[] array;
        long start,end;

        for(int size : sizes) {
            array = new int[size];

            fill(array);

            start = System.currentTimeMillis();

            //Selection.sort(array);
            Bubble.sort(array);
            //Insertion.sort(array);

            end = System.currentTimeMillis();

            System.out.println("Para " + size + " -> " + (end-start) + " milisegundos.");

        }
        //mostrar(array);

    }
}
