import java.time.*;

/**
 * java.util.Date   (legacy)
 * 
 * 
 * LocalDate
 * LocalTime
 * LocalDateTime
 * ZonedDateTime (ZoneId)
 * 
 * Duration
 * Period
 * 
 */

public class Exemplu11 {
    
    public static void main(String [] args) {
        LocalTime t1 = LocalTime.now(); 
        LocalTime t2 = LocalTime.of(10, 55);
        LocalTime t3 = LocalTime.of(10, 55, 20);
        LocalTime t4 = LocalTime.of(10, 55, 30, 100);
        
        // 10:55
        // 10:55:30.0000000100
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
        LocalTime rez1 = t1.minusMinutes(10);
        LocalTime rez2 = t1.plusMinutes(10);
        
        System.out.println(rez1);
        System.out.println(rez2);
        
        if (t1.isAfter(t2)) {
            System.out.println("HELLO");
        } else {
            System.out.println("WORLD");
        }
    }
    
}