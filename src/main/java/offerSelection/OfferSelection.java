package offerSelection;

public class OfferSelection {

    public static void main(String[] args) {

        int compensationWork1 = 35000;
        int compensationWork2 = 36000;
        double wayToWork1 = 1.2;
        double wayToWork2 = 1.6;
        int workDayOnMonth = 22;
        int workHoursOnDay = 8;

        double compensationForOneHour1 = compensationWork1 / ((workHoursOnDay + (wayToWork1 * 2)) * workDayOnMonth);
        System.out.println(compensationForOneHour1);
        double compensationForOneHour2 = compensationWork2 / ((workHoursOnDay + (wayToWork2 * 2)) * workDayOnMonth);
        System.out.println(compensationForOneHour2);

        if (compensationForOneHour1 > compensationForOneHour2) {
            System.out.println("Следует выбрать первый оффер");
        } else if (compensationForOneHour1 < compensationForOneHour2){
            System.out.println("Следует выбрать второй оффер");
        } else {
            System.out.println("Оплаты за 1 час с учетом дороги равны");
        }

    }
}
