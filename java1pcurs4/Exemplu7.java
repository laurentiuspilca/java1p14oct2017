import java.util.*;
import java.util.stream.*;

public class Exemplu7 {

    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
                new Produs("cioco", 10), 
                new Produs("bere", 5));
                
        Map<String, Integer> map = 
            produse.stream().collect(Collectors.toMap(p -> p.nume, p -> p.pret));
            
        System.out.println(map);
    }
}