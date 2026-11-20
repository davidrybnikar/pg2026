package skola.interfacy;
import java.util.Arrays;

public class Clovek implements Comparable<Clovek> {
    private String jmeno;
    private String prijmeni;

    public Clovek(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }
    @Override
    public int compareTo(Clovek jinyClovek) {
        int vysledekPrijmeni = this.prijmeni.compareTo(jinyClovek.prijmeni);
        if (vysledekPrijmeni == 0) {
            return this.jmeno.compareTo(jinyClovek.jmeno);
        }

        return vysledekPrijmeni;
    }
    @Override
    public String toString() {
        return this.prijmeni + " " + this.jmeno;
    }
    public static void main(String[] args) {
        Clovek[] lide = {
                new Clovek("Jan", "Novák"),
                new Clovek("Petr", "Svoboda"),
                new Clovek("Adam", "Novák"),
                new Clovek("Eva", "Dvořáková")
        };
        Arrays.sort(lide);
        for (Clovek c : lide) {
            System.out.println(c);
        }
    }
}
