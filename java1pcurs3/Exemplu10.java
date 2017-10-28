import java.util.*;

public class Exemplu10 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("ABC","SEDFR","TGFR","QWERTY","EE");
        
        long nr = 
            list.stream()
                .map(s -> Arrays.asList(s.split("\\s*")))
                .flatMap(q -> q.stream())
                .filter(c -> "aeiou".contains(c.toLowerCase()))
                .count();
                
        System.out.println(nr);
    }
}