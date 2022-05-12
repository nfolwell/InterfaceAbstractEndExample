public class SwimmingPool implements TwoDimensionalGeometry, ThreeDimensionalGeometry
{
  private int poolDepth;
  private int edge1distance;
  private int edge2distance;
  private boolean hasDivingBoard;
  
  public SwimmingPool(int depth, int edge1, int edge2, boolean divingBoard)
  {
    poolDepth = depth;
    edge1distance = edge1;
    edge2distance = edge2;
    hasDivingBoard = divingBoard;
  }
  
  public boolean canDiveInPool()
  {
    if (hasDivingBoard)
    {
      return true;
    }
    return poolDepth > 6;
  }
  
  // implementing TwoDimensionalGeometry interface methods
  public double area()
  {
    return (edge1distance * edge2distance);
  }
  
  public double perimeter()
  {
    return (2 * edge1distance + 2 * edge2distance);
  }

  // implementing ThreeDimensionalGeometry interface methods
  public double volume()
  {
    return (poolDepth * edge1distance * edge2distance);
  }
}