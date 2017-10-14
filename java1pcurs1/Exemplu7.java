import java.io.*;

public class Exemplu7 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("pisica");
            ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            Pisica p = (Pisica) in.readObject();
            System.out.println(p.nume + " " + p.varsta);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}