package sumElementArray;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SumElementArray {

    public static void main(String[] args) {

        int arrayLength = 50;
        int[] intArray = new int[arrayLength];
        int arraySum = 0;

        for (int i = 0; i < intArray.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(11);
            intArray[i] = randomNum;
            arraySum += randomNum;
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println("Сумма всех элементов массива: " + arraySum);
    }
}
