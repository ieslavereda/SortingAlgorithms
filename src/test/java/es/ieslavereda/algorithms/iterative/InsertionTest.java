package es.ieslavereda.algorithms.iterative;

import es.ieslavereda.tools.Display;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    private final List<Integer> orinalIntegers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    private final List<String> originalStrings = Arrays.asList("avion","barco","camion","dado","hueco","jarabe","kilo","pera");
    private int[] integerArray;
    private String[] stringArray;

    @BeforeEach
    void setUp() {
        int i;

        List<Integer> integers = new ArrayList<>(orinalIntegers);
        Collections.shuffle(integers);

        List<String> strings = new ArrayList<>(originalStrings);
        Collections.shuffle(strings);

        integerArray = new int[integers.size()];
        i=0;
        for(Integer integer : integers)
            integerArray[i++]=integer;

        stringArray = new String[strings.size()];
        i=0;
        for(String string : strings)
            stringArray[i++]=string;

    }

    @Test
    @Order(1)
    @DisplayName("Testing integers sorting")
    void sortIntegers() {

        System.out.println("Before sort: ");
        Display.mostrar(integerArray);
        Insertion.sort(integerArray);
        System.out.println("After sort: ");
        Display.mostrar(integerArray);

        for(int i = 0; i< integerArray.length; i++)
            assertEquals(integerArray[i],orinalIntegers.get(i));

    }

    @Test
    @Order(2)
    @DisplayName("Testing strings sorting")
    void sortStrings() {

        System.out.println("Before sort: ");
        Display.mostrar(stringArray);
        Insertion.sort(stringArray);
        System.out.println("After sort: ");
        Display.mostrar(stringArray);

        for(int i = 0; i< stringArray.length; i++)
            assertEquals(stringArray[i],originalStrings.get(i));

    }
}