package pisemka;

public class Rohaty extends Tvar{
    @Override
    public String skupina() {
        return "Rohaty";
    }
    public String info() {
        String odpoved = super.info();
        odpoved += "skupina: " + skupina() + "\n";
        return odpoved;
    }
}
