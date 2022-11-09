package sortArrayReverse;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayReverse {

    public static void main(String[] args) {

        int[] intArray = new int[]{50, 41, 19, 17, 16, 15, 14, 11, 1, 0};

        Integer[] arraySortRevers = new Integer[intArray.length];
        Integer[] arrayCopy = new Integer[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            arraySortRevers[i] = intArray[i];
            arrayCopy[i] = intArray[i];
        }

        Arrays.sort(arraySortRevers, Collections.reverseOrder());

        if (Arrays.equals(arrayCopy, arraySortRevers)) {
            System.out.println("массив отсортирован по убыванию");
        } else {
            System.out.println("массив не отсортирован по убыванию");
        }

    }
}
