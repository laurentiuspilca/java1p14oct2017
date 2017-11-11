import java.util.concurrent.*;
import java.util.*;

public class SquareAction extends RecursiveAction {

    
    private List<Integer> list;
    
    public SquareAction(List<Integer> list) {
        this.list = list;
    }
    
    public void compute() {
        if (list.size() < 3) {
            list.forEach(v -> System.out.println(v * v));
            return;
        }
        
        int mid = list.size() / 2;
        
        SquareAction a1 = new SquareAction(list.subList(0, mid));
        SquareAction a2 = new SquareAction(list.subList(mid, list.size()));
        
        invokeAll(a1,a2);
    }
}