import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter 2 strings:");
    String[] inputs = {scanner.next(), scanner.next()};
    
    if (inputs[0].equals(inputs[1])) System.out.println("Equal!");
    else if (inputs[0].equalsIgnoreCase(inputs[1])) System.out.println("Different case");
    else if (inputs[0].substring(0, inputs[0].length() - 1).equals(inputs[1].substring(0, inputs[1].length() - 1)))
      System.out.println("Close enough");
    else System.out.println("Try again");
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
