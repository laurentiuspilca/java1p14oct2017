import java.util.*;
import java.util.stream.*;

public class Exemplu9 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7);
        
        list.parallelStream()
             // aici putem avea orice operatie intermediara
             .map(v -> doubleValue(v))
             .forEach(System.out::println);
    }
    
    private static Integer doubleValue(Integer v) {
        try {Thread.sleep(1000);} catch (Exception e) {}
        return 2 * v;
    }
}