import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number between 0 and 50:");
    int x = scanner.nextInt();
    
    if (x <= 0 || x >= 50) {
      System.out.println("error");
      return;
    }
    
    for (int i = x; i <= 50; i += 5) {
      IntStream.range(i, Math.min(i + 5, 51)).forEach(value -> System.out.print(value + " "));
      System.out.println();
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
