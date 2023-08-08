import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("What is your favorite number?");
    int number = scanner.nextInt();
    System.out.printf("Your name is %s and you like the number %d.", name, number);
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
