package arrayManual;

import java.util.Arrays;

public class ArrayManual {

    public static void main(String[] args) {

        int[] intArray = new int[10];

        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        intArray[4] = 4;
        intArray[5] = 5;
        intArray[6] = 6;
        intArray[7] = 7;
        intArray[8] = 8;
        intArray[9] = 9;

        System.out.println(Arrays.toString(intArray));

        int[] intArray2 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(intArray2));


    }


}
