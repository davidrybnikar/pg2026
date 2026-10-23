public class Zvire {
    String jmeno;

    public Zvire() {
        this.jmeno = jmeno;
    }
    public String mujdruh(){
        return "...";
    }
    public String mujpoddruh(){
        return "...";
    }
    public int mojenohy(){
        return 0;
    }
    public String mujzvuk(){
        return "...";
    }
    public String info() {
        String odpoved = "======= " + jmeno + " =======\n";
        odpoved += "Druh:"+ mujdruh() +"\n";
        odpoved += "Poddruh:"+ mujpoddruh() +"\n";
        odpoved += "Pocet nohou:"+ mojenohy() +"\n";
        odpoved += "Zvuk:"+ mujzvuk() +" \n";
        return odpoved;
    }

    }

