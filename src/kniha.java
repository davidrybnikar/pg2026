public class kniha {
    private String nazev;
    private String autor;
    private int pocetstran;
    private boolean jevypujcena;
    private String zapujcil;
    private String vratitel;

    public kniha(String nazev, String autor, int pocetstran) {
        this.nazev = nazev;
        this.autor = autor;
        this.pocetstran = pocetstran;
        jevypujcena = false;
        this.zapujcil = null;
        this.vratitel = null;
    }
    public void vypujcit(String pujcil){
        if(jevypujcena) {
            System.out.println("chyba uz je vypujcena");
        }
            else
            {
                jevypujcena = true;
                this.zapujcil = pujcil;
                System.out.println("knihu ma pucenou " + zapujcil);
            }


    }
    public void vratit(String vratil) {
        if (jevypujcena) {
            if (zapujcil == vratil) {
                jevypujcena = false;
                vratitel = vratil;
                System.out.println("knihu vratil " + vratitel);
            } else {
                System.out.println("nejde vratit knihu pujcil nekdo jiny");
            }
        }
        else {
            System.out.println("kniha je pujcena " + zapujcil);
        }
    }
    @Override
    public String toString() {
        return "kniha{" +
                "nazev='" + nazev + '\'' +
                ", autor='" + autor + '\'' +
                ", pocetstran=" + pocetstran +
                ", jevypujcena=" + jevypujcena +
                '}';
    }
    static void main() {
        kniha a = new kniha("Bila nemoc", "Karel Capek",327);
        kniha b = new kniha("farma zvirat", "george orwell",264);

        System.out.println(a);
        System.out.println(b);
        System.out.println("Jan si jde vypujcit");
        a.vypujcit("jan");
        System.out.println("knihu si jde pujcit petr");
        a.vypujcit("petr");
        System.out.println("Jan jde vratit");
        a.vratit("petr");

    }
}
