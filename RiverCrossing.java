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
      return false;
    }
    else return true;
  }

  public boolean isGoal()
  {
    return man && goat && cabbage && lion;
  }
}
