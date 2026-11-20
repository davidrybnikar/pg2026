package skola.interfacy;

public class intern extends Clovek {
    public intern(String jmeno, String prijmeni) {
        super(jmeno, prijmeni);
    }

    @Override
    public double getSalary() {
        return super.getSalary()/2;
    }
}
