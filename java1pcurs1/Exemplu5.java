import java.io.*;

public class Exemplu5 {

    public static void main(String [] args) {
        try (
            InputStreamReader isr1 = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr1)
        ) {
            System.out.print("FILE:");
            String file = cons.readLine();
            
            try (
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(fis);
                BufferedReader in = new BufferedReader(reader)
            ) {
                int suma = 0;
                String line;
                
                while ( (line = in.readLine() ) != null) {
                    suma += Integer.parseInt(line);
                }
                System.out.println("SUMA: " + suma);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}