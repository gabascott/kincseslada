package kincseslada;

import java.util.Scanner;

public class Kincseslada {

    public static void main(String[] args) {
        indit();
    }

    private static void indit() {
        Lada lada1 = new Lada();
        lada1.nev = "Arany";
        lada1.leiras = "Én rejtem a kincset";

        Lada lada2 = new Lada();
        lada2.nev = "Ezüst";
        lada2.leiras = "Nem én rejtem a kincset";

        Lada lada3 = new Lada();
        lada3.nev = "Bronz";
        lada3.leiras = "Az arany láda hazudik";

        System.out.println(lada1.toString());
        System.out.println(lada2.toString());
        System.out.println(lada3.toString());

        System.out.print("\nMelyik láda rejti a kincset: ");
        Scanner sc = new Scanner(System.in);
        String valasztott;
        valasztott = sc.nextLine();

        if (valasztott.equals("Arany")) {
            System.out.println("Nyertél");
        } else {
            System.out.println("Nem nyert");
        }
    }

}
