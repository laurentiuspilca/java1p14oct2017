import java.util.concurrent.*;

public class Exemplu4 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Runnable r = () -> System.out.println("HELLO WORLD");
        
        Future<?> f = service.submit(r);
        
        // alte operatii
        
        try {
            f.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}