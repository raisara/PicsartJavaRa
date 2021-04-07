package hw3;

public class Test {
    public static void main(String[] args) {
        Music music1 = new Music();
        music1.name="The Crave";
        music1.artistName="Jelly Roll Morton";
        music1.genre="jazz";
        music1.information();

        Music music2 = new Music();
        music2.name="Bambam";
        music2.artistName="Angie, Harrison First";
        music2.genre="";
        music2.year=2019;
        //music2.information();
        music2.genre="electropop";
        music2.information();
        System.out.println(music2.year);

        Finance somebody = new Finance();
        somebody.personName="A. Vardanyan";
        somebody.setIncome(800700L);
        double a=somebody.ekamtayin();
        System.out.println(a);
        somebody.getIncome();

    }
}
