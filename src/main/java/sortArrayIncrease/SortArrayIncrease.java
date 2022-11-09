package sortArrayIncrease;

import java.util.Arrays;

public class SortArrayIncrease {

    public static void main(String[] args) {

        int[] intArray = new int[]{0, 1, 11, 14, 15, 16, 17, 41, 19, 50};

        int[] intArraySortIncrease = intArray.clone();
        Arrays.sort(intArraySortIncrease);

        if (Arrays.equals(intArray, intArraySortIncrease)) {
            System.out.println("массив отсортирован по возрастанию");
        } else {
            System.out.println("массив не отсортирован по возрастанию");
        }

    }
}
