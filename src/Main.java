import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter two test scores:");
    double[] testScores = {scanner.nextDouble(), scanner.nextDouble()};
    for (double test : testScores) {
      if (test < 0 || test > 100) System.out.println("Not Valid");
    }
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
