package pisemka;

public class Ctverec extends Rohaty{
    public double obvod(){
        return 4.1*4;
    }
    public String druh() {
        return "skola.Tvary.Ctverec";
    }
    public String info() {
        String odpoved = super.info();
        odpoved += "obvod "+ obvod();
        odpoved += "\'"+"druh "+ druh() + "\n";
        return odpoved;
    }
}
