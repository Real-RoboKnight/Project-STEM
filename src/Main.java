import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a positive integer:");
    int x = scanner.nextInt();
    
    if (x <= 0) {
      System.out.println("error");
      return;
    }
    
    IntStream.range(0, x / 3 + 1)
          .map(value -> -value * 3)
          .sorted() // Inverse sort by sorting negatives, and then sign flipping
          .map(value -> -value)
          .forEach(value -> System.out.print(value + " "));
    System.out.println();
//
    for (boolean y = false; !y; y = !y){}
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
