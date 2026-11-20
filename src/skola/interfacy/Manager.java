package skola.interfacy;

public class Manager extends Clovek{
    private Clovek[] podrizeni;
    public Manager(String jmeno, String prijmeni, Clovek[] podrizeni) {
        super(jmeno, prijmeni);
        this.podrizeni = podrizeni;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 2000* podrizeni.length;
    }
}

