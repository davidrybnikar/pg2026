public class Ctverec {
    private Bod roh1;
    private int a;

    public Ctverec(Bod roh1, int a) {
        this.roh1 = roh1;
        this.a = a;
    }

    @Override
    public String toString() {
        return "ctverec{" +
                "x=" + roh1.getX() +
                "y="+roh1.getY()  +
                ", a=" + a +
                '}';
    }
    public double plocha(){
        return 2 * r;
    }
}
