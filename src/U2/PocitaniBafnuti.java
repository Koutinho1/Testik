package U2;

public class PocitaniBafnuti {

    public static void main(String[] args) {
        System.out.println(pocetBaf("BAF-baf! BAF"));
        System.out.println(pocetBaf("ticho"));
        System.out.println(pocetBaf("baFbaf"));
        System.out.println(pocetBaf(""));
        System.out.println(pocetBaf(null));
    }

    public static int pocetBaf(String text) {
        if (text == null ||text.length() < 3) {
            return 0;
        }

        String malaPismenka = text.toLowerCase();
        int pocet = 0;

        for (int i = 0; i < malaPismenka.length() -2; i++) {
            if (malaPismenka.substring(i, i + 3).equals("baf")) {
                pocet++;
            }
        }
        return pocet;
    }
}
