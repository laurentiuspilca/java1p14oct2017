public class Exemplu14 {

    public static void main(String [] args) {
        OddNumbersThread t = new OddNumbersThread();
        t.start();
        System.out.println("THE END");
    }
}