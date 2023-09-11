import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("N: ");
    int n = scanner.nextInt();
    System.out.println("Sum = " + IntStream.range(1, n+1).sum());
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
