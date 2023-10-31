package es.ieslavereda.algorithms.iterative;

import static es.ieslavereda.tools.Array.swap;

public class Insertion {

    /*
	Se utiliza un método similar al Selection, tomando un elemento de la parte no ordenada para
	colocarlo en su lugar en la parte ordenada. El primer elemento del array (arreglo[0]) se
	considerado ordenado (la lista inicial consta de un elemento). A continuación se inserta el
	segundo elemento (arreglo[1]) en la posición correcta (delante o detrás de arreglo[0]) dependiendo
	de que sea menor o mayor que arreglo[0]. Repetimos esta operación sucesivamente de tal
	modo que se va colocando cada elemento en la posición correcta. El proceso se repetirá
	length-1 veces.
	Para colocar el dato en su lugar, se debe encontrar la posición que le corresponde en la
	parte ordenada y hacerle un hueco de forma que se pueda insertar. Para encontrar la
	posición se puede hacer una búsqueda secuencial desde el principio del conjunto hasta
	encontrar un elemento mayor que el dado. Para hacer el hueco hay que desplazar los
	elementos pertinentes una posición a la derecha.
	El orden de complejidad de este algoritmo es cuadrático (O(length^2)).

	https://algorithm-visualizer.org/brute-force/insertion-sort
    */


    public static void sort(int[] v){

        int buffer;
        int i,j,k;

        for(i = 1; i < v.length; i++){
            j=0;
            buffer=v[i];

            // Avanzamos por el arreglo hasta encontrar la posicion donde colocar el valor de buffer
            while (v[j]<buffer){
                j++;
            }

            // Comprobamos si su posicion no es la ultima de la parte ordenada
            if(j<i){
                // Movemos todos los valores a la derecha de la posicion un puesto a la derecha.
                for (k=i;k>j;k--){
                   swap(v,k,k-1);
                }
            }
        }
    }

    public static void sort(String[] v){

        String buffer;
        int i,j,k;

        for(i = 1; i < v.length; i++){
            j=0;
            buffer=v[i];

            // Avanzamos por el arreglo hasta encontrar la posicion donde colocar el valor de buffer
            while (v[j].compareTo(buffer)<0){
                j++;
            }

            // Comprobamos si su posicion no es la ultima de la parte ordenada
            if(j<i){
                // Movemos todos los valores a la derecha de la posicion un puesto a la derecha.
                for (k=i;k>j;k--){
                    swap(v,k,k-1);
                }
            }
        }
    }

}