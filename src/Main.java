import java.util.Scanner;  // Import the Scanner class
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input a String:");
    char[] input = scanner.nextLine().toCharArray();
    System.out.println("Input an integer:");
    int repeat = scanner.nextInt();
    
    for (char letter : input) {
      for (int x = 0; x <= repeat; x++) {
        System.out.print(letter);
      }
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
