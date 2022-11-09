package fightJediAndSith;

public class FightJediAndSith {

    public static void main(String[] args) {
        /* Для проверки:
        Ситхи: Палпатин, Дарт Мол
        Джедаи: Оби Ван
         */

        String sithName = "Валера";
        String jediName = "Аркадий";
        int sithPosition = 10;
        int jediPosition = 10;

        Fight.fight(sithName, jediName, sithPosition, jediPosition);
    }
}
