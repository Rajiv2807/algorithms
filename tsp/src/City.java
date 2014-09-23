import java.util.Arrays;

public class City
{
  
  // Each city has a unique id.
  private final int id;                                  
  // x coordinate of the city
  private double x;                                
  // y coordinate of the city
  private double y;                                
  // array containing distances of this city from other cities
  private double distanceTo[];                     

  public City(int id, double x, double y)
  {
    this.id = id;
    this.x = x;
    this.y = y;
  }

  //This method can be eliminted if we are using a 2D matrix to store distance information.
  public void assignDistanceTo(double[] distanceTo)
  {
    this.distanceTo = Arrays.copyOf(distanceTo, distanceTo.length);
  }

}
