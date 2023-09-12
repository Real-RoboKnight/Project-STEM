import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class
import java.util.stream.DoubleStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    boolean loop = true;
    
    DoubleStream.Builder longitude = DoubleStream.builder();
    DoubleStream.Builder latitude = DoubleStream.builder();
    
    while (loop) {
      System.out.println("Please enter the longitude: ");
      double loopLongitude = scanner.nextDouble();
      System.out.println("Please enter the latitude: ");
      double loopLatitude  = scanner.nextDouble();

      if (Math.abs(loopLongitude) > 180 ) { // Check if in bounds, if not error code
        System.out.println("Incorrect Latitude or Longitude");
      } else if (Math.abs(loopLatitude) > 90) {
        System.out.println("Incorrect Latitude or Longitude");
      } else {
        longitude.add(loopLongitude);
        latitude.add(loopLatitude);
      }
      System.out.println("Would you like to enter another location?");
      loop = scanner.nextInt() == 1;
    }
    
    double[] Longitude = longitude.build().toArray();
    double[] Latitude = latitude.build().toArray();
    
    System.out.println("Farthest North: " + Arrays.stream(Latitude).max().getAsDouble());
    System.out.println("Farthest South: " + Arrays.stream(Latitude).min().getAsDouble());
    System.out.println("Farthest East: " + Arrays.stream(Longitude).max().getAsDouble());
    System.out.println("Farthest West: " + Arrays.stream(Longitude).min().getAsDouble());
    
    
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
