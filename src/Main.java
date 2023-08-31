import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your temperature?");
    double temp = scanner.nextDouble();
    System.out.print( (temp < 97 || temp > 99) ? "NOT NORMAL" : "Temperature is OK");
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
