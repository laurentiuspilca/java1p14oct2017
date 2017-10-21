import java.nio.file.*;

public class Exemplu10 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D");
        Path p2 = Paths.get("C:/A/B/X/Y");
        
        Path rez = p1.relativize(p2);
        
        System.out.println(rez);
    }
}