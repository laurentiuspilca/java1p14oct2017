import java.util.concurrent.*;

public class Exemplu10 {

    private Semaphore s = new Semaphore(5);
    private int x;
    
    
    public void increment() throws InterruptedException {
        s.acquire();
        x++;
        s.release();
    }
    
    public void afisare() throws InterruptedException  {
        s.acquire();
        System.out.println(x);
        s.release();
    }
}