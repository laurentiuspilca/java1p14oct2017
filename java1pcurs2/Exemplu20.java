import java.nio.file.*;
import java.io.*;

public class Exemplu20 {

    public static void main(String [] args) {
        Path p = Paths.get("./");
        try {
            //Files.list(p)
            Files.walk(p, 10)
            .filter(x -> x.toString().endsWith(".java"))
            .filter(x -> x.getFileName().toString().length() % 2 == 0)
            .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}