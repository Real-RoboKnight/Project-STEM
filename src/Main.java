import java.util.Scanner;  // Import the Scanner class
//import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter two string: ");
    String one = scanner.nextLine();
    String two = scanner.nextLine();
    
    if (one.length() != two.length()) {
      System.out.println("error");
      return;
    }
    
    for (int i = one.length() - 1; i >= 0; i--) {
      System.out.print("" + two.charAt(i) + one.charAt(i));
    }


    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
