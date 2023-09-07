import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Welcome. What is your name?");
    System.out.printf("Hello %s. Are you ready to crack the code?\n", scanner.nextLine());
    if (!scanner.nextLine().equalsIgnoreCase("Yes"))
      return;
    
    System.out.println("\nPhase 1\nEnter a string:");
    if (! (scanner.nextLine().length() == 3)) {
      System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
      return;
    }
    
    System.out.println("Correct!\n\nPHASE 2\nEnter a number:");
    int num = scanner.nextInt();
    if (!( num == 19 || (num >= 35 && num < 78))) {
      System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
      return;
    }
    
    System.out.println("Correct!\n\nPHASE 3\nEnter a number:");
    int num2 = scanner.nextInt();
    if (!(num2 > 0 && (num2 % 2 == 0 || num2 % 10 == 1) )) {
      System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
      return;
    }
    System.out.println("Correct!\nYou have cracked the code!");
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
