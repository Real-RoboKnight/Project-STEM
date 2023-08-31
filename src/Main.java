import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter two integers:");
    int one = scanner.nextInt();
    int two = scanner.nextInt();
    System.out.printf("%d + %d = ?\n", one, two);
    if (scanner.nextInt() == one + two) System.out.println("Correct!");
    else System.out.println("Wrong");
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
