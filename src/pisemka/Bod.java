package pisemka;

public class Bod extends Obly{
    public String druh() {
        return "Bod";
    }

    public String info() {
        String odpoved = super.info();
        odpoved += "\'"+"druh "+ druh() + "\n";
        return odpoved;
    }
}
