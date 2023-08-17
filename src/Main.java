import java.util.Scanner;  // Import the Scanner class
import shapes.*
public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
  
    String str1 = scanner.nextLine();
    String str2 = new String(str1);
    str1 = str1.toUpperCase();
    str2 = str2.substring(0,1).toUpperCase() + str2.substring(1);
    System.out.println(str2);
    System.out.println(str1);
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
