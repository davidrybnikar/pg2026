package pisemka;

public class Kruh extends Obly{
    public String druh() {
        return "Kruh";
    }
    public double obvod(){
        return 3.14*2*4.7;
    }
    public String info() {
        String odpoved = super.info();
        odpoved += "obvod"+ obvod();
        odpoved += "\'"+ "druh "+ druh() + "\n";
        return odpoved;
    }
}
