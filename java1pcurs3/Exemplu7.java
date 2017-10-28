import java.util.*;

public class Exemplu7 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("AAD","BBB","QQQQ");
        
        boolean b1 = list.stream()
                         .map(s -> s.length())
                         .allMatch(n -> n % 2 == 0);
                         
        boolean b2 = list.stream()
                         .map(s -> s.length())
                         .anyMatch(n -> n % 2 == 0);   
                         
        boolean b3 = list.stream()
                         .map(s -> s.length())
                         .noneMatch(n -> n % 2 == 0);
                         
        System.out.println(b1);   
        System.out.println(b2);   
        System.out.println(b3);   
    }
}