import java.util.concurrent.locks.*;

public class Exemplu11 {

    private ReadWriteLock s = new ReentrantReadWriteLock();
    private int x;
    
    
    public void increment() throws InterruptedException {
        s.writeLock().lock();
        x++;
        s.writeLock().unlock();
    }
    
    public void afisare() throws InterruptedException  {
        s.readLock().lock();
        System.out.println(x);
        s.readLock().unlock();
    }
}