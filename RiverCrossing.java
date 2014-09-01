import java.lang.*;
import java.util.*;

public class RiverCrossing
{
  boolean man;
  boolean goat;
  boolean cabbage;
  boolean lion;

  public RiverCrossing( boolean man, boolean goat, boolean cabbage, boolean lion )
  {
    man=man;
    goat=goat;
    cabbage=cabbage;
    lion=lion;
  }

  public boolean isValid()
  {
    if (man==goat) 
    {
      return true;
    }
    else
    {
      if (goat==cabbage || goat==lion) return false;
      return true;
    }
  }

  public boolean isGoal()
  {
    return man && goat && cabbage && lion;
  }

  public boolean equals(Object y)
  {
    if (y == this) return true;

    if (y == null) return false;

    if (this.getClass() != y.getClass() ) return false;

    RiverCrossing that = (RiverCrossing)y;
    if (that.man!=man) return false;
    if (that.goat!=goat) return false;
    if (that.cabbage!=cabbage) return false;
    if (that.lion!=lion) return false;
    return true;
  }

  public Iterable<RiverCrossing> neighbors()
  {
    Stack<RiverCrossing> neighbors = new Stack<RiverCrossing>();

    RiverCrossing neighbour1 = new RiverCrossing(!man, goat, cabbage, lion);
    RiverCrossing neighbour2 = new RiverCrossing(!man, !goat, cabbage, lion);
    RiverCrossing neighbour3 = new RiverCrossing(!man, goat, !cabbage, lion);
    RiverCrossing neighbour4 = new RiverCrossing(!man, goat, cabbage, !lion);
    return neighbors;
  }

}
