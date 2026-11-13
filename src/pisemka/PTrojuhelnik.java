package pisemka;

public class PTrojuhelnik extends Rohaty{
    public String druh() {
        return "Pravouhly trojuhelnik";
    }
    public double obvod() {
        return 0.5 * 3.1 * 8.7;
    }
    public String info() {
        String odpoved = super.info();
            odpoved += "obvod "+ obvod();
        odpoved += "\'"+"druh "+ druh() + "\n";
        return odpoved;
    }
}
