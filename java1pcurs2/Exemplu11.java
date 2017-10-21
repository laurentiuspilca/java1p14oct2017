import java.nio.file.*;
import java.io.File;

public class Exemplu11 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/B/C/./../../././X/Y/Z/../../Q/W/./E");
        
        //  A/X/Q/W/E
        
        Path p2 = p1.normalize();
        
        System.out.println(p2);
        
        File f = p2.toFile();
        Path p3 = f.toPath();
    }
}