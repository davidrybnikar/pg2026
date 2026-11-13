package pisemka;

public class Obly extends Tvar{
    @Override
    public String skupina() {
        return "Obly";
    }
    public String info() {
        String odpoved = super.info();
        odpoved += "skupina: " + skupina() + "\n";
        return odpoved;
    }
}
