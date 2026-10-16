public class kruh  {
    private bod stred;
    private double r;

    public kruh(bod stred, double r) {
        this.stred = stred;
        this.r = r;
    }

    @Override
    public String toString() {

        return "kruh{" +
                "x=" + stred.getX() +
                ", y=" + stred.getY() +
                ", r=" + r +
                '}';
    }
    public double plocha(){
        return Math.PI*r*r;
    }
}
