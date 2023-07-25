import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many feet do you have? ");
        double feet = scanner.nextDouble();
        System.out.print((int) feet / 3);

    }
}
