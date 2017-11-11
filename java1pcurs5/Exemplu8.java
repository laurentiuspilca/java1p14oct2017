import java.util.concurrent.*;
import java.util.*;

public class Exemplu8 {

    public static void main(String [] args) {
        ForkJoinPool pool = new ForkJoinPool();
         
        List<Integer> list = Arrays.asList(2,5,7,8,9,4,5,7,8,3,2,5);
        SquareAction action = new SquareAction(list);
        
        pool.invoke(action);
    }
}