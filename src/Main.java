import java.util.Collections;
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the Scores:");
     ArrayList<Integer> scores = new ArrayList<Integer>();
     int currentScores;
     while ((currentScores = scanner.nextInt()) != -1)
       scores.add(currentScores);
    System.out.println("The largest score is " + Collections.max(scores));

    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
