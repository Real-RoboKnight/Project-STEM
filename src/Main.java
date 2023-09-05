import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Please enter the latitude: ");
    double latitude = scanner.nextDouble();
    System.out.print("Please enter the longitude: ");
    double longitude = scanner.nextDouble();
    
    System.out.print( (-90 <= latitude && latitude <= 90) ? "" : "latitude is incorrect\n" );
    System.out.print( (-180 <= longitude && longitude <= 180) ? "" : "longitude is incorrect\n" );
    System.out.println( (-90 <= latitude && latitude <= 90) && (-180 <= longitude && longitude <= 180) ?
        "The location: " + latitude + ", " + longitude : "");
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
