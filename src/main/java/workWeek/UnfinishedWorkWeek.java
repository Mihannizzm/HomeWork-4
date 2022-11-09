package workWeek;

import java.util.Arrays;

public class UnfinishedWorkWeek {

    public static void main(String[] args) {

        int[][] workDay = {
                {1, 0, 6, 5, 1, 12, 7},
                {1, 43, 1, 5, 1, 12, 6},
                {1, 0, 1, 3, 1, 12, 5},
                {1, 0, 1, 5, 1, 0, 4},
                {1, 0, 1, 3, 1, 12, 3},
                {1, 7, 5, 5, 1, 12, 2}
        };

        int[] workWeek = new int[workDay.length];
        int sumWorkDay = 0;

        for (int i = 0; i < workDay.length; i++) {
            for (int j = 0; j < workDay[i].length; j++) {
                sumWorkDay += workDay[i][j];
            }
            workWeek[i] = sumWorkDay;
            sumWorkDay = 0;
        }
        System.out.println(Arrays.toString(workWeek));
    }
}
