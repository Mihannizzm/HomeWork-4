package workWeek;

import java.util.ArrayList;
import java.util.List;

public class WorkWeek {

    public static void main(String[] args) {

        int[] workDay = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1, 5, 5, 0, 2, 2, 2, 1, 5, 5, 0};

        List<Integer> workWeek = new ArrayList<>();
        int sumWorkDay = 0;
        int j = 1;

        for (int i = 0; i < workDay.length; ) {
            for (; j <= 7; j++) {
                sumWorkDay += workDay[i];
                i++;
            }
            j = 1;
            workWeek.add(sumWorkDay);
            sumWorkDay = 0;
        }
        System.out.println(workWeek);
    }
}
