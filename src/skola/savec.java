package skola;

public class savec extends Zvire {
    public String mujpoddruh() {
        return "skola.savec";
    }
    public String dejdelkukojeni() {
        return null;
    }
    public String info() {
        String odpoved = super.info();
    odpoved += "Koji dni: "+ dejdelkukojeni() + "\n";
        return odpoved;
}

}
