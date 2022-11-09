package anomaliesInArray;

//Попробовать решить через создание и сортировку новых массивов
public class SearchAnomalies {

    public static void searchAnomalies(int[] array) {


        for (int i = 0, j = 1, n = 2; i < array.length; ) {

            if (j >= array.length || n >= array.length) {
                break;
            } else {

                if (array[j] < array[i]) {

                    if (array[n] > array[j]) {
                        System.out.println(array[n] + " - аномальный элемент");
                        i = n;
                        j = i + 1;
                        n = n + 2;
                    } else {
                        i++;
                        j++;
                        n++;
                    }
                } else if (array[j] > array[i]) {

                    if (array[n] < array[j]) {
                        System.out.println(array[n] + " - аномальный элемент");
                        i = n;
                        j = i + 1;
                        n = n + 2;
                    } else {
                        i++;
                        j++;
                        n++;
                    }
                }

            }

        }
    }
}
