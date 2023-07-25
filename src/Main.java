
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi there. What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What state do you live in? ");
        String state = scanner.nextLine();
        System.out.printf("My name is %s. I live in %s.", name, state);

        /*
        String[] Names = new String[4];
        System.out.println("Please enter four names:");
        for (int i = 0; i < 4; i++) {
            Names[i] = new Scanner(System.in).nextLine();
        }
        System.out.println(Names[0] + Names[1] + Names[2] + Names[3]);
        z
        console.print("What is your name?\n");
        String hi = new Scanner(System.in).nextLine();
        System.out.print("Hello, " + hi);

        for (int i = 0; i < 3; i++) {
            console.println("HI");
        }
    System.out.println("=========");
    System.out.println("= 0   0 =   Java is Awesome!");
    System.out.println("=   v   =");
    System.out.println("=========");
*/

    }
}
