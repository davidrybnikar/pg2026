public class Bod {
    private int x;
    private int y;

    public Bod(int x, int y) {
        this.x = x;
        this.y = y;
    }
public double vzdalenost(Bod soused) {
        int bodx1 = this.x - soused.x;
        int body1 = this.y - soused.y;

    return Math.sqrt(bodx1*bodx1+ body1 + body1);
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double plocha(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "bod{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
