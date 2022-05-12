public class Cube extends Shape implements ThreeDimensionalGeometry
{
  private int edgeLength;

  public Cube(int edgeLength)
  {
    super(6); // 6 faces, or sides
    this.edgeLength = edgeLength;
  }

  // implementing abstract method
  public void printInfo()
  {
    System.out.println("I am a cube with edge length " + edgeLength);
  }

  // interface methods
  public double volume()
  {
    return (Math.pow(edgeLength, 3));
  }
}