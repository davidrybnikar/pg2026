package skola.interfacy;
import java.util.Arrays;

public class Clovek implements Comparable<Clovek> {
    private String jmeno;
    private String prijmeni;


    public Clovek(String jmeno, String prijmeni ) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;

    }
    public double getSalary() {
        return 40000;
    }

    public int compareTo(Clovek dalsiClovek) {
        int serazenePrijmeni = this.prijmeni.compareTo(dalsiClovek.prijmeni);
        if (serazenePrijmeni == 0) {
            serazenePrijmeni = this.jmeno.compareTo(dalsiClovek.jmeno);
        }
        return serazenePrijmeni;
    }
    @Override
    public String toString() {
        return this.prijmeni + " " + this.jmeno + " " + getSalary();
    }
    public static void main(String[] args) {
        Clovek[] podrizeni = {
                new Clovek("David", "Ryba"),
                new Clovek("Erik", "Humr"),
                new Clovek("Marty", "Ryba"),
                new Clovek("Nazar", "Pitsur"),
                new Clovek("Ondrej","Rozkosny"),
                new intern("petr","Ludvik"),
        };
        Arrays.sort(podrizeni);
        for (Clovek C : podrizeni) {
            System.out.println(C);
        }
    }
}
