package U1;

import java.util.ArrayList;
import java.util.Arrays;

public class EvidenceDuchu {
    public static void main(String[] args) {
        String[] zpravy = {
                "Ve sklepe strasi [ Casper ] uz od pulnoci. ",
                "Na pude je [BOO]. ",
                "V chodbe je [Al]. ",
                "Za oknem je [LovecDuchu]. ",
                "U dveri je [ ]. ",
                "Na schodech je [DlouhatanskeJmeno]. ",
                "Nekdo napsal ]Berta[.",
                "V kuchyni je [Berta. ",
                null,
                "V salu je [ casper ]. ",
                "U brany je [Boo]. ",
                "Na vezi je [Berta]. "
        };
        ArrayList<String> duchove = new ArrayList<>();
        int pocetNeplatnych = 0;
        int pocetDuplicitnich = 0;

        for (String zprava : zpravy) {
            String jmeno = jmenoDucha(zprava);
            if (jmeno == null || jmeno.isEmpty()) {
                pocetNeplatnych ++;
            } else if (uzEvidovan(duchove, jmeno)) {
                pocetDuplicitnich ++;
            } else {
                duchove.add(jmeno);
            }
        }

        int celkemOdmitnutych = pocetDuplicitnich + pocetDuplicitnich;

        System.out.println("Pocet evidovanych duchu " + duchove.size());
        System.out.println("Pocet neplatnych zprav " + pocetNeplatnych);
        System.out.println("Pocet duplicitnich " + pocetDuplicitnich);
        System.out.println("Odmitnutnych zprav " + celkemOdmitnutych);
        System.out.println("Jmena evidovana " + duchove);
    }

    public static String jmenoDucha(String zprava) {
        if (zprava == null) {
            return null;
        }

        int zacatek = zprava.indexOf('[');
        if (zacatek == -1) {
            return "";
        }

        int konec = zprava.indexOf(']');
        if (konec == -1) {
            return "";
        }

        if (zacatek + 1 >= konec) {
            return "";
        }

        String jmeno = zprava.substring(zacatek + 1, konec).trim();

        if (jmeno.length() < 3 || jmeno.length() > 12) {
            return "";
        }

        if (jmeno.toLowerCase().contains("lovec")){
            return "";
        }
        return jmeno;
    }
    public static boolean uzEvidovan(ArrayList<String> duchove, String jmeno) {
        for (String zpava : duchove) {
            if (zpava.equalsIgnoreCase(jmeno)) {
                return true;
            }
        }
        return false;
    }
}
