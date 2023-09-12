import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
//    IntStream.range(0, 13).map(value -> value * 2 + 1).forEach(System.out::println);
    
    for (int x : IntStream.range(0, 13).toArray()) {
      System.out.println(x*2+1);
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
