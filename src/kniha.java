public class kniha {
    private String nazev;
    private String autor;
    private int pocetstran;
    private boolean jevypujcena;
    private String zapujcil;

    public kniha(String nazev, String autor, int pocetstran) {
        this.nazev = nazev;
        this.autor = autor;
        this.pocetstran = pocetstran;
        jevypujcena = false;
        this.zapujcil = null;
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
    public void vratit(String vratil){
        jevypujcena = false;
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
        a.vypujcit("petr");
        System.out.println(a);
        System.out.println(a);
    }
}
