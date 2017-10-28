import java.util.stream.*;

public class Exemplu4 {

    public static void main(String [] args) {
        Stream<Integer> s1 = Stream.empty();
        
        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9);
        
        Stream<Integer> s3 = Stream.iterate(1, i -> i + 2);
        
        Stream<Integer> s4 = Stream.generate(() -> 1);
        
        s3.limit(10)
          .forEach(System.out::println);
          
        s4.limit(10)
          .forEach(System.out::println);
    }
}