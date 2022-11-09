package attractionControl;

public class AttractionControl {

    public static void main(String[] args) {

        int childGrowth = 152;
        int needGrowth = 160;
        boolean childWithParents = false;

        if (childGrowth >= needGrowth || childWithParents == true) {
            System.out.println("Ребенку можно на аттракцион");
        } else {
            System.out.println("Ребенку нельзя на аттракцион");
        }


    }
}
