package es.ieslavereda.algorithms.iterative;

import static es.ieslavereda.tools.Array.swap;

public class Bubble {

    /*
    El metodo de la burbuja es uno de los mas simples, es tan facil como comparar todos
	los elementos de una lista contra todos, si se cumple que uno es mayor o menor a
	otro, entonces los intercambia de posición.
	La burbuja mas simple de todas es la que compara todos con todos, generando comparaciones
	extras, por ejemplo, no tiene sentido que se compare con sigo mismo o que se compare
	con los valores anteriores a el, ya que supuestamente, ya estan ordenados.

    https://algorithm-visualizer.org/brute-force/bubble-sort
     */



    // En estos metodos utilizamos la version mas simple en el que todos los elementos se comparan
    // con todos.
    public static void sort(int[] array){

        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length-1;j++){

                if(array[j]>array[j+1])
                    swap(array,j,j+1);
            }
        }
    }

    public static void sort(String[] array){

        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length-1;j++){

                if(array[j].compareTo(array[j+1])>0)
                    swap(array,j,j+1);
            }
        }
    }


    // En estos metodos, tenemos en cuenta que en la parte derecha existen elementos que ya no es necesario comprobar
    public static void sortV2(int[] array){

        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length-1-i;j++){

                if(array[j]>array[j+1])
                    swap(array,j,j+1);
            }
        }
    }

    // En estos metodos, como podemos asumir que en algun paso intermedio, el vector puede ya estar ordenado, paramos las
    // siguientes iteraciones.
    public static void sortV3(int[] array){
        int i=0;
        boolean swaping=true;

        while(i< array.length && swaping){
            swaping = false;
            for(int j=0;j< array.length-1-i;j++){

                if(array[j]>array[j+1]) {
                    swap(array, j, j + 1);
                    swaping=true;
                }
            }
            i++;
        }
    }


}
