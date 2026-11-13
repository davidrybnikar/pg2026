package pisemka;

public class Bod extends Obly{
    public String druh() {
        return "skola.Tvary.Bod";
    }

    public String info() {
        String odpoved = super.info();
        odpoved += "\'"+"druh "+ druh() + "\n";
        return odpoved;
    }
}
