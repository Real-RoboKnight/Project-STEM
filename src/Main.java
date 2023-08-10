import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What type of item are you buying?");
    String item = scanner.nextLine();
    System.out.println("How many are you buying?");
    int quantity = scanner.nextInt();
    System.out.println("How much does each one weigh?");
    float weight = scanner.nextFloat();
    System.out.printf("%d %s at %.2f pounds each will weigh %.2f pounds total", quantity, item, weight, quantity * weight);
    
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
