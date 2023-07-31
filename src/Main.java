import java.util.Scanner;  // Import the Scanner class

public class Main {

  public static void main( String [] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please input a decimal number:");
    double number = scanner.nextDouble();
    number -= (int) number;
    int[] digits = new int[3];
    for (int i = 0; i < 3; i++) {
      number *= 10;
      digits[i] = (int) number;
      number -= (int) number;
    }
    System.out.printf("Answer: %d %d %d", digits[0], digits[1], digits[2]);



    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
