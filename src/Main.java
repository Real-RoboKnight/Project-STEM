import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a four digit number: ");
        int number = scanner.nextInt();
        if (number > 9999 | number < 1000) throw new Exception("Invalid Input");
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        number %= 1000;
        numbers[1] = number / 100;
        number %= 100;
        numbers[2] = number / 10;
        number %= 10;
        numbers[3] = number;
        System.out.printf("Here are the digits:\n%d\n%d\n%d\n%d", numbers[3], numbers[2], numbers[1], numbers[0]);

    }
}
