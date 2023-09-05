import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int input = scanner.nextInt();
    System.out.println( (65 <= input && input <= 100) ? "False" : "True" );
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
