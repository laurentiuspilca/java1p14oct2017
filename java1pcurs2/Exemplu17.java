import java.util.*;

public class Exemplu17 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("HELLO", "JOHN");
        
        list.stream()
            .filter(s -> s.length() % 2 == 0)
            .map(s -> s.length() * 2)
            .forEach(System.out::println);
    }
}