public class bod {
    private int x;
    private int y;

    public bod(int x, int y) {
        this.x = x;
        this.y = y;
    }
public double vzdalenost(bod soused) {
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

    @Override
    public String toString() {
        return "bod{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
