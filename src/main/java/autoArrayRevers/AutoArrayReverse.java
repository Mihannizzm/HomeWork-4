package autoArrayRevers;

import java.util.Arrays;

public class AutoArrayReverse {

    public static void main(String[] args) {

        int[] intArray = new int[100];

        for (int i = 0, j = intArray.length - 1; i < intArray.length; i++, j--) {
            intArray[i] = j;
        }

        System.out.println(Arrays.toString(intArray));
    }
}
