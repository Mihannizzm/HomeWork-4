package IdealWeight;

public class IdealWeight {

    public static void main(String[] args) {

        double personGrowth = 185;
        double personWeight = 60;
        double idealWeight = personGrowth - 100 - ((personGrowth - 100) * 0.1) - 5;

        if (idealWeight == personWeight) {
            System.out.println("Идеальный вес");
        } else {
            System.out.println("Неидеальный вес");
        }

    }
}
