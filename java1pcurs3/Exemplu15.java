import java.time.*;

public class Exemplu15 {

    public static void main(String [] args) {
        
        ZonedDateTime zd1 = ZonedDateTime.now();
        ZonedDateTime zd2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        
        System.out.println(zd1);
        System.out.println(zd2);
        
        ZonedDateTime zd3 = zd1.plusHours(17);
        ZonedDateTime zd4 = zd1.plusHours(16);
        
        System.out.println(zd3);
        System.out.println(zd4);
    }
}