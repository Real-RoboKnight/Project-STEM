import java.util.Scanner;

public class Main {
  
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    timeOfDay(scanner.nextInt());
  }
  
  public static void timeOfDay(int time) throws IllegalArgumentException {
    if (time == 0) System.out.println("midnight");
    else if (time == 12 ) System.out.println("noon");
    else if (time == 18) System.out.println("dusk");
    else if (0 < time && time < 12) System.out.println("morning");
    else if (12 < time && time < 18) System.out.println("afternoon");
    else if (18 < time && time < 24) System.out.println("evening");
    else throw new IllegalArgumentException("Time must be between 0 - 24; exclusive");
  }
}
