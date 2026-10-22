public class Main {
    static void main() {
        Bod bod1 = new Bod(10,10);
        Bod bod2 = new Bod(20,25);

        Kruh k1 = new Kruh(bod1,bod1.vzdalenost(bod2));
        int aCtverce = (int) (k1.getR() * 2);
        Ctverec c1 = new Ctverec(bod1, aCtverce);

        System.out.println(bod1);
        System.out.println(bod2);
        System.out.println(k1);
        System.out.println(c1);
        double vzdalenost = bod1.vzdalenost(bod2);
        System.out.println(vzdalenost);



    }
}
