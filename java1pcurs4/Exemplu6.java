import java.util.*;
import java.util.stream.*;

public class Exemplu6 {

    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
                new Produs("cioco", 10), 
                new Produs("bere", 5));
                
        double av =         
            produse.stream()
                .collect(Collectors.averagingInt(p -> p.pret));       
                
        System.out.println(av);        
    }
}