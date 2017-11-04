import java.util.*;
import java.util.stream.*;

public class Exemplu1 {
    
    public static void main(String [] args) {
        List<String> list = Arrays.asList("aaa", "bb", "c", "qqqqq");
        
        String rez = 
            list.stream()
                .map(s -> String.valueOf(s.length()))
                .collect(Collectors.joining(","));
                
        System.out.println(rez);        
    }
}