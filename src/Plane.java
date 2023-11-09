import java.util.stream.IntStream;

public class Plane {
  private int location;
  
  Plane() {
    this(0);
  }
  Plane(int location) {
    this.location = location;
    if (this.location > 2000)
      this.location = 0;
    else if (this.location < -2000)
      this.location = 0;
  }
  private void boundsCheck(){
    location = Math.min(Math.max(location, -2000), 2000);
  }
  private void move (int distance) {
    location += distance;
    boundsCheck();
  }
  public void upwards() {
    move(100);
  }
  public void downwards() {
    move(-100);
  }
  
  public String toString () {
    return " ".repeat(Math.max(0, (location + 2000) / 100)) + '@';
  }
  
  public int getLocation () {
    return location;
  }
}
