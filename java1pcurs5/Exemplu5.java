import java.util.concurrent.*;
import java.time.*;

public class Exemplu5 {

    public static void main(String [] args) throws Exception {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        
        Runnable r = () -> System.out.println("HELLO " + LocalDateTime.now());
        
        //service.schedule(r, 5, TimeUnit.SECONDS);
        //service.scheduleAtFixedRate(r, 1, 3, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(r, 1, 3, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
        
        service.shutdown();
    }
}