public class Rectangle {
  private double base, height;
  
  Rectangle () {
    this(1, 1);
  }
  
  Rectangle (double base, double height) {
    this.base = (base > 0) ? base : 1;
    this.height = (height > 0) ? height : 1;
  }
  
  public boolean equals (Rectangle other) {
    return (this.height == other.height) && (this.base == other.base);
  }
  
  public double getArea () {return base * height;}
  
  public double getBase () {return base;}
  
  public double getHeight () {return height;}
  
  public double getDiagonal () {return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));}
  
  public double getPerimeter () {return base * 2 + height * 2;}
  
  public void setBase (double base) {if (base > 0) this.base = base;}
  
  public void setHeight (double height) {if (height > 0) this.height =  height;}
  
  public String toString () {return "rectangle with base " + base + ", height " + height;}
}
