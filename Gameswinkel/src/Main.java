import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1;
        int releaseJaar2 = LocalDate.now().getYear() - 2;

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);

        if (p1.koop(g1)) {
            System.out.println("p1 koopt g1: gelukt");
        }else {
            System.out.println("p1 koopt g1: niet gelukt");
        }

        if (p1.koop(g2)) {
            System.out.println("p1 koopt g2: gelukt");
        }else {
            System.out.println("p1 koopt g2: niet gelukt");
        }

        if (p1.koop(g3)) {
            System.out.println("p1 koopt g3: gelukt");
        }else {
            System.out.println("p1 koopt g3: niet gelukt");
        }

        if (p2.koop(g2)) {
            System.out.println("p2 koopt g2: gelukt");
        }else {
            System.out.println("p2 koopt g2: niet gelukt");
        }

        if (p2.koop(g1)) {
            System.out.println("p2 koopt g1: gelukt");
        }else {
            System.out.println("p2 koopt g1: niet gelukt");
        }

        if (p3.koop(g3)) {
            System.out.println("p3 koopt g3: gelukt");
        }else {
            System.out.println("p3 koopt g3: niet gelukt");
        }

        System.out.println("p1: " + p1.toString());

        System.out.println("p2: " + p2.toString());

        System.out.println("p3: " + p3.toString());

        if (p1.verkoop(g1, p3)) {
            System.out.println("p1 verkoopt g1 aan p3: gelukt");
        }else {
            System.out.println("p1 verkoopt g1 aan p3: niet gelukt");
        }

        if (p1.verkoop(g1, p3)) {
            System.out.println("p1 verkoopt g1 aan p3: gelukt");
        }else {
            System.out.println("p1 verkoopt g1 aan p3: niet gelukt");
        }

        if (p2.verkoop(g1, p1)) {
            System.out.println("p2 verkoopt g1 aan p1: gelukt");
        }else {
            System.out.println("p2 verkoopt g1 aan p1: niet gelukt");
        }

        System.out.println("p1: " + p1.toString());

        System.out.println("p2: " + p2.toString());

        System.out.println("p3: " + p3.toString());

    }
}
