import java.util.*;
import java.util.stream.*;

public class Exemplu16 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("aa", "qqq", "vv", "qwer", "ert", "gggt");
        
        /*
         * 2 2
         * 3 2
         * 4 2
         * 
         */
        
        Map<Integer, Long> map =
            list.stream().collect(
            Collectors.groupingBy(String::length, 
                Collectors.counting()));
                
        System.out.println(map);        
    }
}