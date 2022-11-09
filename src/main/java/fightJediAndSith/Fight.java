package fightJediAndSith;

public class Fight {

    public static void fight(String sithName, String jediName, int sithPosition, int jediPosition) {

        if (sithName == "Палпатин") {
            System.out.println("Победу одержал ситх " + sithName);
        } else if (jediName == "Оби Ван" && sithName == "Дарт Мол" && sithPosition == jediPosition) {
            System.out.println("Победу одержал джейдай " + jediName);
        } else {
            if (sithPosition > jediPosition) {
                System.out.println("Победу одержал джейдай " + jediName);
            } else if (sithPosition < jediPosition) {
                System.out.println("Победу одержал джейдай " + jediName);
            } else if (sithPosition == jediPosition) {
                System.out.println("Победу одержал ситх " + sithName);
            }
        }

    }
}
