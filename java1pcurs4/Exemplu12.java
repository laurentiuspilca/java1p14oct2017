import java.util.*;
import java.util.stream.*;

public class Exemplu12 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("aaa", "aaaa", "bbbb", "a", "eee", "qweert");
        
        Map<Boolean, List<String>> map = 
            list.stream().collect(
                Collectors.partitioningBy(s -> s.length() % 2 == 0));
                
        System.out.println(map);
    }
}