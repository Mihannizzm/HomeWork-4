package isArrayBig;

public class IsArrayBig {

    public static void main(String[] args) {

        int[] intArray = new int[]{14, 18, 14, 1, 1, 1, 16, 17, 19, 0};
        int arraySum = 0;

        for (int i = 0; i < intArray.length; i++) {
            arraySum += intArray[i];
        }

        if (arraySum > 100) {
            System.out.println("Это большой массив");
        } else if (arraySum < 100) {
            System.out.println("Это маленький массив");
        }
    }
}
