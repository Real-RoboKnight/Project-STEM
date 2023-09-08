import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input a word:");
    String word = scanner.nextLine();
    
    int current_index = 0;
    while (word.length() > current_index + 3) {
      System.out.print(word.substring(current_index, current_index + 2));
      current_index += 3;
    }
    System.out.println(word.substring(current_index));
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
