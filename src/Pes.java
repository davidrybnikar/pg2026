public class Pes extends savec {
    String barvavoditka;
    public String mujdruh(){
        return "pes";
    }
    public int mojenohy(){
        return 4;
    }
    public String mujzvuk(){
        return "haf";
    }
    public String dejdelkukojeni(){
        return "56 dni";
    }
    public String info() {
        String odpoved = super.info();
        odpoved += "barva voditka: " + barvavoditka+ "\n";
        return odpoved;
    }
}