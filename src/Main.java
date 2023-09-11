import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter two numbers:\n");
    int num1 = scanner.nextInt();
    num1 += (num1 % 2 == 1) ? 0 : 1;
    
    int num2 = scanner.nextInt();
    num2 += (num2 % 2 == 1) ? 0 : -1;
    
    System.out.println();
    for (int i = num1; i <= num2; i+=2) {
      System.out.print(i + " ");
    }
    
    
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
