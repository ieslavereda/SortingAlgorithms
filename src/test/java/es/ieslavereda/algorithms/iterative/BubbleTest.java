package es.ieslavereda.algorithms.iterative;

import es.ieslavereda.tools.Display;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleTest {

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
    @DisplayName("Testing integers sorting version 1")
    void sortIntegers() {

        System.out.println("Before sort: ");
        Display.mostrar(integerArray);
        Bubble.sort(integerArray);
        System.out.println("After sort: ");
        Display.mostrar(integerArray);

        for(int i = 0; i< integerArray.length; i++)
            assertEquals(integerArray[i],orinalIntegers.get(i));

    }

    @Test
    @DisplayName("Testing integers sorting version 2")
    void sortIntegersV2() {

        System.out.println("Before sort: ");
        Display.mostrar(integerArray);
        Bubble.sortV2(integerArray);
        System.out.println("After sort: ");
        Display.mostrar(integerArray);

        for(int i = 0; i< integerArray.length; i++)
            assertEquals(integerArray[i],orinalIntegers.get(i));

    }
    @Test
    @DisplayName("Testing integers sorting version 3")
    void sortIntegersV3() {

        System.out.println("Before sort: ");
        Display.mostrar(integerArray);
        Bubble.sortV3(integerArray);
        System.out.println("After sort: ");
        Display.mostrar(integerArray);

        for(int i = 0; i< integerArray.length; i++)
            assertEquals(integerArray[i],orinalIntegers.get(i));

    }

    @Test
    @DisplayName("Testing strings sorting")
    void sortStrings() {

        System.out.println("Before sort: ");
        Display.mostrar(stringArray);
        Bubble.sort(stringArray);
        System.out.println("After sort: ");
        Display.mostrar(stringArray);

        for(int i = 0; i< stringArray.length; i++)
            assertEquals(stringArray[i],originalStrings.get(i));

    }

}