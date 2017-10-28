import java.util.*;

public class Exemplu8 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("AAA", "BB", "QQQ","WWWW");
        
        long nr = 
            list.stream()
                .filter(x -> x.length() % 2 == 0)
                .count();
        
        System.out.println(nr);
    }
}