import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter a integer:");
    if (scanner.nextInt() == 48) System.out.println("YES");
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
