import java.util.*;
import java.util.stream.*;

public class Exemplu11 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("aaaa", "aaw", "qwert", "bbbb", "a", "wer");
        
        /*
         * 4 "aaaa,bbbb"
         * 3 "aaw,wer"
         * 1 "a"
         * 5 "qwert"
         */
        
        Map<Integer, String> map = 
            list.stream()
                .collect(
                    Collectors.groupingBy(s -> s.length(), // String::length
                        Collectors.joining(",")));
                
        System.out.println(map);        
    }
}