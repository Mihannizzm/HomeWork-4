package greetings;

public class Greetings {

    public static void main(String[] args) {

        int currentHour = 22;
        int currentDayOfWeek = 7;

        //Вызов метода для получения приветствия
        GetGreetings.getGreetings(currentHour, currentDayOfWeek);
    }
}
