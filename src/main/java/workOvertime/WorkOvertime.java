package workOvertime;
/**
Программа считает переработки. Суббота и воскресенье считаются выходными днями, отработанные в эти дни часы
 приравниваются к переработке.
 Для определения дня для первого элемента массива, необходимо присвоить
переменной startingDay одно из значений:
Понедельник - 1470098 Вторник - 206655 Среда - 46001 Четверг - 740573 Пятница -
107476 Суббота - 1353572 Воскресенье - 0
 */

public class WorkOvertime {

    public static void main(String[] args) {

        int[] hoursWork = new int[]{8, 10, 9, 10, 8, 12, 14, 9};
        int startingDay = 1470098;
        int workingDayNorm = 8;

        //Вызов расчета переработок
        CalcOvertime.calcOvertime(hoursWork, startingDay, workingDayNorm);

    }

}
