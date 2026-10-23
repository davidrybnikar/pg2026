public class savec extends Zvire {
    public String mujpoddruh() {
        return "savec";
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
