public class Main {
    static void main() {
        bod bod1 = new bod(10,10);
        bod bod2 = new bod(20,25);

        kruh k1 = new kruh(vzdalenost,3.2);


        System.out.println(bod1);
        System.out.println(bod2);
        System.out.println(k1);
        double vzdalenost = bod1.vzdalenost(bod2);
        System.out.println(vzdalenost);


    }
}
