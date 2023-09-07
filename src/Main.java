import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter password:");
    System.out.println( (scanner.next().equals("bulbasaur")) ? "Access granted!" : "Access denied!");
  
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
