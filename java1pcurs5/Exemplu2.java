import java.util.concurrent.*;

public class Exemplu2 {

    public static void main(String [] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);
        
        Runnable r1 = () -> System.out.println("Hello World!");
        
        service.execute(r1);
        
        service.shutdown(); //service.shudownNow()
    }
}