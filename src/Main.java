import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter any numbers (Enter 5 to stop)");
    double sum = 0;
    double input;
    while ((input = scanner.nextDouble()) != 5)
      sum += input;
    System.out.println("Sum is " + sum);
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
