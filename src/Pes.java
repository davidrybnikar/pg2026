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
        String odpoved = "======= " + jmeno + " =======\n";
        odpoved += "barva voditka: " + barvavoditka+ "\n";
        odpoved += "Druh:"+ mujdruh() +"\n";
        odpoved += "Poddruh:"+ mujpoddruh() +"\n";
        odpoved += "Pocet nohou:"+ mojenohy() +"\n";
        odpoved += "Zvuk:"+ mujzvuk() +" \n";
        odpoved += "Koji dni: "+ dejdelkukojeni() + "\n";
        return odpoved;
    }
}