import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    if(( a != 0 && b == 0 || a % b != 0))
      System.out.println(b + " is not a factor of " + a);
    else
      System.out.println(b + " is a factor of " + a);
  
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
