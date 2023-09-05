import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter two number:");
    int[] input = {scanner.nextInt(), scanner.nextInt()};
    System.out.println( (input[0] >= 0 && input[1] >= 0 && input[0] % 2 == 0 && input[1] % 2 == 0) ? "Both are positive and even." : "At least one is negative or odd.");
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
