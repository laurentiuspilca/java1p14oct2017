import java.util.*;
import java.util.stream.*;

public class Exemplu2 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,5,7,8);
        
        List<Integer> rez = 
            list.stream()
                .map(v -> v*v)
                .collect(Collectors.toList());
        
        System.out.println(rez);    
    }
}