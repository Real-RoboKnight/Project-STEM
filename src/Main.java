import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the numerator: ");
        double Numerator = scanner.nextDouble();
        System.out.print("Please enter the denominator: ");
        double Denominator = scanner.nextDouble();
        System.out.printf("The decimal value is: %.3f", Numerator/Denominator);
    }
}
