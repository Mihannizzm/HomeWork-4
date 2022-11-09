package workOvertime;

import java.util.ArrayList;

public class CalcOvertime {

    public static void calcOvertime(int[] hoursWork, int startingDay, int workingDayNorm) {

        ArrayList<String> daysWeek = new ArrayList(); //Массив для названий дней недели
        int saturday, sunday; //Переменные для определния первых выходных дней в массиве

        //Вызов метода расчета с учетом того, с какого дня начинается неделя
        switch (startingDay) {

            case 1470098: // понедельник
                daysWeek.add("понедельник");
                daysWeek.add("вторник");
                daysWeek.add("среду");
                daysWeek.add("четверг");
                daysWeek.add("пятницу");
                daysWeek.add("субботу");
                daysWeek.add("воскресенье");
                saturday = 5;
                sunday = 6;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            case 206655: // вторник
                daysWeek.add("вторник");
                daysWeek.add("среду");
                daysWeek.add("четверг");
                daysWeek.add("пятницу");
                daysWeek.add("субботу");
                daysWeek.add("воскресенье");
                daysWeek.add("понедельник");
                saturday = 4;
                sunday = 5;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            case 46001: // среда
                daysWeek.add("среду");
                daysWeek.add("четверг");
                daysWeek.add("пятницу");
                daysWeek.add("субботу");
                daysWeek.add("воскресенье");
                daysWeek.add("понедельник");
                daysWeek.add("вторник");
                saturday = 3;
                sunday = 4;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            case 740573: // четверг
                daysWeek.add("четверг");
                daysWeek.add("пятницу");
                daysWeek.add("субботу");
                daysWeek.add("воскресенье");
                daysWeek.add("понедельник");
                daysWeek.add("вторник");
                daysWeek.add("среду");
                saturday = 2;
                sunday = 3;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            case 107476: // пятница
                daysWeek.add("пятницу");
                daysWeek.add("субботу");
                daysWeek.add("воскресенье");
                daysWeek.add("понедельник");
                daysWeek.add("вторник");
                daysWeek.add("среду");
                daysWeek.add("четверг");
                saturday = 1;
                sunday = 2;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            case 1353572: // суббота
                daysWeek.add("субботу");
                daysWeek.add("воскресенье");
                daysWeek.add("понедельник");
                daysWeek.add("вторник");
                daysWeek.add("среду");
                daysWeek.add("четверг");
                daysWeek.add("пятницу");
                saturday = 0;
                sunday = 1;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            case 0: // воскресенье
                daysWeek.add("воскресенье");
                daysWeek.add("понедельник");
                daysWeek.add("вторник");
                daysWeek.add("среду");
                daysWeek.add("четверг");
                daysWeek.add("пятницу");
                daysWeek.add("субботу");
                saturday = 6;
                sunday = 0;
                calcForSwitch(hoursWork, daysWeek, saturday, sunday, workingDayNorm);
                break;

            default:
                System.out.println("Неккоректный код дня начала отсчета.");

        }

    }

    //Метод расчета переработок
    public static void calcForSwitch(int[] hoursWork, ArrayList<String> daysWeek,
                                     int saturday, int sunday, int workingDayNorm) {
        int workHoursForAllDay = 0;
        int workHoursForSaturday = 0;
        int workHoursForSunday = 0;
        int workOvertimeOneDay;
        int numberOfWorkingDays = 0;


        for (int i = 0, j = 0; i < hoursWork.length; i++, j++) {
            if (j >= daysWeek.size()) {
                j = 0;
            }
            if (i == saturday) {
                workHoursForSaturday += hoursWork[i];
                workOvertimeOneDay = hoursWork[i];
                System.out.println(i + " - Переработка за " + daysWeek.get(j) + " составляет "
                        + workOvertimeOneDay + " часов.");
                saturday += 7;
            } else if (i == sunday) {
                workHoursForSunday += hoursWork[i];
                workOvertimeOneDay = hoursWork[i];
                System.out.println(i + " - Переработка за " + daysWeek.get(j) + " составляет "
                        + workOvertimeOneDay + " часов.");
                sunday += 7;
            } else {
                workHoursForAllDay += hoursWork[i];
                workOvertimeOneDay = hoursWork[i] - workingDayNorm;
                if (workOvertimeOneDay > 0) {
                    System.out.println(i + " - Переработка за " + daysWeek.get(j) + " составляет "
                            + workOvertimeOneDay + " часов.");
                } else if (workOvertimeOneDay < 0) {
                    System.out.println(i + " - Недоработка за " + daysWeek.get(j) + " составляет "
                            + Math.abs(workOvertimeOneDay) + " часов.");
                } else {
                    System.out.println(i + " - За " + daysWeek.get(j) + " отработано нужное колличество часов");
                }
                numberOfWorkingDays++;
            }

        }
        int needWorkAll = numberOfWorkingDays * workingDayNorm; //нужно было работать часов за отработанные дни
        int workAll = workHoursForAllDay - needWorkAll + workHoursForSaturday + workHoursForSunday; // общая переработка
        System.out.println("\nОбщая пераработка составляет " + workAll + " часов");

    }
}
