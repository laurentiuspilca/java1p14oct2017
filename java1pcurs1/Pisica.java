public class Pisica implements java.io.Serializable {
    public static final long serialVersionUID = 1;

    String nume;
    int varsta;
    String culoare;
    
    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}