import java.util.*;

public class Exemplu18 {
    
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7);
        
        int suma = list.stream()
            .filter(x -> x % 2 == 1)
            .reduce(0, (a,b) -> a+b);
            
        System.out.println(suma);    
    }
}