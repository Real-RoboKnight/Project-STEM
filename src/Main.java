import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;
//import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 10; i > 0 ; i--) {
      for (int x = 0; x < i; x++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
