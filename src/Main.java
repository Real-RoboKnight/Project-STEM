import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    for (int i = 1; i <= 5; i++) {
      System.out.println(num*i);
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
