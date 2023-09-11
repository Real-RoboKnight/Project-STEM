import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    
    for (int i = 0; n > 0; i++) {
      int digit = n % 10;
      n /= 10;
      System.out.println(digit * (int) Math.pow(10, i));
    }
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
