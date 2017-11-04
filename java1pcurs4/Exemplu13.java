import java.util.*;

public class Exemplu13 {

    public static void main(String [] args) {
        Optional<String> o1 = Optional.empty();
        
        Optional<String> o2 = Optional.of("HELLO");
        
        String hello = "HELLO";// poate fi null
        Optional<String> o3 = Optional.ofNullable(hello);
        
        System.out.println(o1.isPresent());
        System.out.println(o2.isPresent());
        
        o2.ifPresent(System.out::println);
        
        o2.filter(s -> s.length() % 2 == 0).ifPresent(System.out::println);
        o2.map(s -> s.length()).ifPresent(System.out::println);
        
        String v = o2.orElse("WORLD!");
        
        String x = o2.get(); // Deprecated!!!
    }
}