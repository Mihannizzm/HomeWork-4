package timesOfDay;

public class TimesOfDay {

    public static void main(String[] args) {

        int currentHour = 23;

        if (currentHour >= 0 && currentHour < 6) {
            System.out.println("Сейчас ночь");
        } else if (currentHour >= 6 && currentHour < 12) {
            System.out.println("Сейчас утро");
        } else if (currentHour >= 12 && currentHour < 18) {
            System.out.println("Сейчас день");
        } else if (currentHour >= 18 && currentHour <= 23) {
            System.out.println("Сейчас вечер");
        }
    }
}
