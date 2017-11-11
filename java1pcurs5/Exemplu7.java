import java.util.concurrent.*;
import java.util.*;

public class Exemplu7 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,2,5,6,7,8,9,4,3,6,7,8,9,4,3,2,0,9,4,1,2,3,5);
        
        ForkJoinPool pool = new ForkJoinPool();
        
        SumListTask task = new SumListTask(list);
        
        Integer rez = pool.invoke(task);
        
        System.out.println("REZULTAT " + rez);
        System.out.println("SUMA " + list.stream().mapToInt(a -> a).sum());
    }
}