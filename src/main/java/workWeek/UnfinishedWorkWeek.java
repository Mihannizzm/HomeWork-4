package workWeek;

import java.util.ArrayList;
import java.util.List;

public class UnfinishedWorkWeek {

    public static void main(String[] args) {

        int[] workDay = {1, 1, 1, 2, 3, 5, 1, 2, 2, 2, 1, 5, 5, 6, 1, 5};

        List<Integer> workWeek = new ArrayList<>();
        int sumWorkDay = 0;
        int elementsForWeek = 1;
        int countForIterations = 1;
        int countIteration = workDay.length / 7;


        for (int elementWorkDay = 0; elementWorkDay < workDay.length; ) {
            for (; countForIterations <= countIteration; countForIterations++) {
                for (; elementsForWeek <= 7; elementsForWeek++) {
                    sumWorkDay += workDay[elementWorkDay];
                    elementWorkDay++;
                }
                elementsForWeek = 1;
                workWeek.add(sumWorkDay);
                sumWorkDay = 0;
            }

            for (; elementWorkDay < workDay.length; elementWorkDay++) {
                sumWorkDay += workDay[elementWorkDay];
            }
            if (sumWorkDay !=  0){
                workWeek.add(sumWorkDay);
            }

        }

        System.out.println(workWeek);
    }
}
