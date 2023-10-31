package es.ieslavereda.tools;

public class Display {
    public static void mostrar(int[] array){
        for(int n : array)
            System.out.print(n + " ");
        System.out.println();
    }
    public static void mostrar(String[] array){
        for(String n : array)
            System.out.print(n + " ");
        System.out.println();
    }
}
