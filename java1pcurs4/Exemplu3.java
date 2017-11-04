import java.util.*;
import java.util.stream.*;

public class Exemplu3 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,5,7,8);
        
        Set<Integer> rez = 
            list.stream()
                .map(v -> v*v)
                .collect(Collectors.toSet());
        
        System.out.println(rez);    
    }
}