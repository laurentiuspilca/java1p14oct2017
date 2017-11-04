import java.util.*;
import java.util.stream.*;

public class Exemplu4 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,5,7,8);
        
        ArrayList<Integer> rez = 
            list.stream()
                .map(v -> v*v)
                .collect(Collectors.toCollection(ArrayList::new));
        /*
         * () -> new ArrayList<>()
         */
        System.out.println(rez);    
    }
}