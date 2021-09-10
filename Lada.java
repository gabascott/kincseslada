package kincseslada;

public class Lada {
    
    String nev, leiras;

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    @Override
    public String toString() {
        return "Láda{" + " Név=" + nev + ", Leírás= " + leiras + '}';
    }
    
}
