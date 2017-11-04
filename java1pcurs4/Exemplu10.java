import java.util.*;
import java.util.stream.*;

public class Exemplu10 {
    
    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
            new Produs("P1", 10),
            new Produs("P2", 20),
            new Produs("P3", 10),
            new Produs("P4", 30),
            new Produs("P5", 20)
        );
        
        Map<Integer, List<Produs>> map = 
            produse.stream().collect(Collectors.groupingBy(p -> p.pret));
            
        System.out.println(map);
    }
}