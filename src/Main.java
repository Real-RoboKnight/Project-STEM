import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String word = scanner.next();
    System.out.println("How many characters would you like to delete at the end?");
    int index = scanner.nextInt();
    
    System.out.printf("%s", word.substring(0, word.length() - index));
    
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
