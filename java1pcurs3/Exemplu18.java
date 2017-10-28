import java.util.*;

public class Exemplu18 {

    public static void main(String [] args) {
        Locale loc = new Locale("fr", "FR");
        
        ResourceBundle bundle = ResourceBundle.getBundle("exemplu", loc);
        
        String hello = bundle.getString("txtHello");
        
        System.out.println(hello);
    }
}