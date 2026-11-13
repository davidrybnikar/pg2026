package pisemka;

public class Tvar {
    public String druh() {
        return "...";
    }

    public String skupina() {
        return "...";
    }

    public double obvod() {
        return 0.0;
    }

    public String info() {
        String odpoved = "";
        odpoved += " Druh, "+ druh();
        odpoved += " skupina, "+ skupina();
        odpoved += " obvod, "+ obvod() ;
        return odpoved;
    }
}
