import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    String order = "apple pie";
    System.out.printf("The current order is %s", order);
    System.out.print("I want to eat something else, what do you want to eat?");
    order = scanner.next();
    System.out.printf("The order has changed to %s", order);
    
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
