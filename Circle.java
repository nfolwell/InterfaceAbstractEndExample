public class Circle extends Shape implements TwoDimensionalGeometry
{
  private int radius;
  
  public Circle(int radius)
  {
    super(1);
    this.radius = radius;
  }
  
  public int getRadius()
  {
    return radius;
  }

  // implementing abstract method
  public void printInfo()
  {
    System.out.println("I am a circle with radius " + radius);
  }

  // implementing interface methods
  public double area()
  {
    return (Math.PI * radius * radius);
  }
  
  public double perimeter() // circumference
  {
    return (2 * Math.PI * radius);
  }
}