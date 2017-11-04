import java.util.*;
import java.util.stream.*;

public class Exemplu5 {

    public static void main(String [] args) {
        
        List<List<String>> list = new ArrayList<>();
        
        list.add(Arrays.asList("aaa", "bbbbb", "cccccc", "d"));
        list.add(Arrays.asList("kkkk", "gggg", "ddd", "dssssss"));
        list.add(Arrays.asList("ertyu", "qazxsw", "dcf", "dyuioplkh"));
        
        List<Integer> values = 
            list.stream()
                .flatMap(k -> k.stream()) // List -> String
                .map(s -> s.length())   // String -> Integer
                .distinct() // unice
                .sorted()   // sorteaza crescator
                .collect(Collectors.toList());
                
        System.out.println(values);        
    }
}