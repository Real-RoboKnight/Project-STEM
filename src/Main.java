import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a sentence:");
    String word = scanner.nextLine();
    System.out.print(word.substring(0, word.indexOf(" ")).length());
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
