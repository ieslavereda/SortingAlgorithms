package es.ieslavereda.algorithms.iterative;

import static es.ieslavereda.tools.Array.swap;

public class Selection {

    /*
	Este método considera que el array está formado por 2 partes: una parte ordenada (la
	izquierda) que estará vacía al principio y al final comprende el array; y una parte
	desordenada (la derecha) que al principio comprende el array y al final estará vacía.
	El algoritmo toma elementos de la parte derecha y los coloca en la parte izquierda;
	empieza por el menor elemento de la parte desordenada y lo intercambia con el que ocupa
	su posición en la parte ordenada. Así, en la primera iteración se busca el menor
	elemento y se intercambia con el que ocupa la posición 0; en la segunda, se busca el menor
	elemento entre la posición 1 y el final y se intercambia con el elemento en la posición 1.
	De esta manera las dos primeras posiciones del array están ordenadas y contienen los dos
	elementos menores dentro del array. Este proceso continúa hasta ordenar todos los
	elementos del array.
	En cada pasada se coloca un elemento en su lugar, y la variable j marca donde empezar la
	búsqueda en la parte desordenada, que será secuencial si no tenemos más información. La
	búsqueda del siguiente elemento menor comienza suponiendo que dicho elemento es j. Se
	comprueba la hipótesis comparándolo con cada uno de los restantes. Si se encuentra uno
	menor, se intercambia.
	El número de comparaciones que realiza este algoritmo es independiente de la ordenación
	inicial. El bucle interno hace length-1 comparaciones la primera vez, length-2 la segunda,...,
	y 1 la última. El bucle externo hace length-1 búsquedas. El total de comparaciones es
	(length^2-length)/2. Por tanto el orden de complejidad es cuadrático (O(length^2)).

	https://algorithm-visualizer.org/brute-force/selection-sort

*/

    public static void sort(int[] array){

        int menor;

        for(int i=0;i<array.length-1;i++){
            menor = i;

            for(int j=i;j< array.length ; j++){

                if(array[j]<array[menor])
                    menor=j;


            }
            if(i!=menor)
                swap(array,i,menor);

        }
    }

    public static void sort(String[] array){

        int menor;

        for(int i=0;i<array.length-1;i++){
            menor = i;

            for(int j=i;j< array.length ; j++){

                if(array[j].compareTo(array[menor])<0)
                    menor=j;


            }
            if(i!=menor)
                swap(array,i,menor);

        }
    }
}
