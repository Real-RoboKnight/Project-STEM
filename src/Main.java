import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int n = scanner.nextInt() + 1;
    System.out.println((int) (n * Math.random()) + 2);
    System.out.println((int) (n * Math.random()) + 2);
    System.out.println((int) (n * Math.random()) + 2);
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
