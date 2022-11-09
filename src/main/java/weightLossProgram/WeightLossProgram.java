package weightLossProgram;

public class WeightLossProgram {

    public static void main(String[] args) {

        int calorieLimit = 1400;
        int caloriesEaten = 1151;
        int canCalories = calorieLimit - caloriesEaten;

        if (canCalories >= 500) {
            System.out.println("Можно съесть кусок сала (500 ккал)");
        } else if (canCalories >= 340) {
            System.out.println("Можно съесть шоколадку (340 ккал)");
        } else if (canCalories >= 250) {
            System.out.println("Можно съесть тарелку каши (250 ккал)");
        } else {
            System.out.println("Лимит калорий на сегодня исчерпан");
        }


    }
}
