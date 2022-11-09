package autoArray;

import java.util.Arrays;

public class AutoArray {

    public static void main(String[] args) {

        int[] intArray = new int[100];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        System.out.println(Arrays.toString(intArray));
    }

}
