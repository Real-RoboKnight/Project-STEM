import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter a letter grade:");
    String next = scanner.next();
    if (next.equals("A")) {
      System.out.println("90-100");
    } else if (next.equals("B")) {
      System.out.println("80-90");
    } else if (next.equals("C")) {
      System.out.println("70-80");
    } else if (next.equals("D")) {
      System.out.println("60-70");
    } else if (next.equals("F")) {
      System.out.println("0-60");
    } else {
      System.out.println("Invalid letter grade");
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
