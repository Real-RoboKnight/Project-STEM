import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    coinConverter(scanner.nextInt());
  }
  
  public static void coinConverter (int cents) {
    System.out.printf("Dollar Bills: %d\n", cents / 100);
    cents %= 100;
    System.out.printf("Quarters: %d\n", cents / 25);
    cents %= 25;
    System.out.printf("Dimes: %d\n", cents / 10);
    cents %= 10;
    System.out.printf("Nickels: %d\n", cents / 5);
    cents %= 5;
    System.out.printf("Pennies: %d\n", cents);
  }
  
  public static double distance (int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
  }
}
