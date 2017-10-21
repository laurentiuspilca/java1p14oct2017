import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Exemplu16 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu16.java");
        try {
            List<String> lines = Files.readAllLines(p1);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}