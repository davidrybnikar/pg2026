public class savec extends Zvire {
    public String mujpoddruh() {
        return "savec";
    }
    public String dejdelkukojeni() {
        return null;
    }
    public String info() {
    String odpoved = "======= " + jmeno + " =======\n";
    odpoved += "Druh:"+ mujdruh() +"\n";
    odpoved += "Poddruh:"+ mujpoddruh() +"\n";
    odpoved += "Pocet nohou:"+ mojenohy() +"\n";
    odpoved += "Zvuk:"+ mujzvuk() +" \n";
    odpoved += "Koji dni: "+ dejdelkukojeni() + "\n";
        return odpoved;
}

}
