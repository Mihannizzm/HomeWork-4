package randomIntArray;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomIntArray {

    public static void main(String[] args) {

        int arrayLength = 100;
        int[] intArray = new int[arrayLength];

        for (int i = 0; i < intArray.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(101);
            intArray[i] = randomNum;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
