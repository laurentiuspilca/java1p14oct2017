import java.util.concurrent.*;

public class FibboTask extends RecursiveTask<Integer> {
    
    
    
    private Integer n;
    
    public FibboTask(Integer n) {
        this.n = n;
    }
    
    public Integer compute() {
        if (n <= 1) {
            return n;
        }
        
        FibboTask f1 = new FibboTask(n-1);
        FibboTask f2 = new FibboTask(n-2);
        
        f2.fork();
        
        return f1.compute() + f2.join();
    }
}