import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter first word:");
    String word1 = scanner.next().toLowerCase();
    System.out.println("Enter second word:");
    String word2 = scanner.next().toLowerCase();
    
    System.out.printf("Result: %d", word1.compareTo(word2));
    
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
