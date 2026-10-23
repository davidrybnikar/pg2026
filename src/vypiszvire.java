import java.sql.SQLOutput;

public class vypiszvire {
    static void main() {
        Zvire z1 = new Zvire();
        Pes z = new Pes();
        Kocka z2 = new Kocka();
        Zmije z3 = new Zmije();
        z3.jmeno = "Erik";
        z2.jmeno = "nazar";
        z.jmeno = "alik";
        System.out.println(z.info());
        System.out.println(z1.info());
        System.out.println(z2.info());
        System.out.println(z3.info());
    }
}
