import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter X1: ");
    double X1 = scanner.nextDouble();
    System.out.print("Enter X2: ");
    double X2 = scanner.nextDouble();
    System.out.print("Enter Y1: ");
    double Y1 = scanner.nextDouble();
    System.out.print("Enter Y2: ");
    double Y2 = scanner.nextDouble();
    System.out.print("Slope: " + (Y2 - Y1) / (X2 - X1));
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
