import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 17; i <= 73; i += 10) {
      IntStream.range(i, i + 10 >= 73 ? 74 : i + 10).forEach(value -> System.out.print(value + " "));
      System.out.println();
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
