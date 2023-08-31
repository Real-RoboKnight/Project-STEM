import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter 5 numbers:");
    double[] numbers = {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};
    System.out.print((Arrays.stream(numbers).average().orElse(Double.NaN) >= 89.95) ? "ABOVE AVERAGE" : "");
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
