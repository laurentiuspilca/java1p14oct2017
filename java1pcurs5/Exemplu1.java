import java.util.concurrent.*;

public class Exemplu1 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        
        try {
            while (true) {
                Thread.sleep(300);
                service.execute(() -> adunare(3, 5));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
    
    private static int adunare(int a, int b) {
        return a + b;
    }
}