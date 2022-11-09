package greetings;

public class GetGreetings {

    public static void getGreetings(int currentHour, int currentDayOfWeek) {

        if (currentDayOfWeek >= 1 && currentDayOfWeek <= 5) {

            if (currentHour >= 5 && currentHour < 8) {
                System.out.println("Доброе утро");
            } else if (currentHour >= 8 && currentHour < 11) {
                System.out.println("Всё пропало ты проспал!");
            } else if (currentHour >= 11 && currentHour <= 18) {
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
            } else {
                System.out.println("Привет!");
            }

        } else if (currentDayOfWeek == 6 || currentDayOfWeek == 7) {

            if (currentHour >= 5 && currentHour < 12) {
                System.out.println("Доброе утро!");
            } else if (currentHour >= 12 && currentHour < 16) {
                System.out.println("Лучше поспать ещё");
            } else if (currentHour >= 16 && currentHour < 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else if (currentHour >= 18 && currentHour < 23) {
                System.out.println("Дааа, с режимом надо что-то делать");
            } else {
                System.out.println("Привет!");
            }

        } else {
            System.out.println("Введите день недели от 1 до 7");
        }
    }
}
