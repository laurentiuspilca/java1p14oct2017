import java.util.*;

public class Exemplu12 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,9);
        
        List<Integer> syncList = Collections.synchronizedList(list);
        
        // folosesc syncList sau list
    }
}