import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter an integer");
    System.out.println( (scanner.nextInt() % 2 == 0) ? "Even" : "Odd" );
    if (false) {} else {}
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
