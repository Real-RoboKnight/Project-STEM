import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter an integer:");
    int num = scanner.nextInt();
    
    if (num % 2 == 0) System.out.println("Divisible by 2!");
    if (num % 3 == 0) System.out.println("Divisible by 3!");
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
