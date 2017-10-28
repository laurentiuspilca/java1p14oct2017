import java.util.*;

public class Exemplu9 {

    public static void main(String [] args) {
        
        List<Integer> list = Arrays.asList(3,4,6,6,6,3,1,1,8,3,2);
        
        int sum = list.stream()
                    .distinct()
                    .mapToInt(x -> x)
                    .sum();
                    
        System.out.println(sum);            
    }
}