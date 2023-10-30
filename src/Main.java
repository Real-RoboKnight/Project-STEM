import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    printDouble(scanner.nextDouble(), scanner.nextInt());
  }
  
  public static void printDouble(double num, int times) {
    IntStream.range(0, times).parallel().forEach(n -> System.out.println(num));
  }
}
