import java.lang.*;
import java.util.*;

public class RCSolver
{

  public Iterable<RiverCrossing> solve(RiverCrossing rc, Stack<RiverCrossing> stack)
  {
    if stack.contains(rc) return null; 
    Iterable<RiverCrossing> neighbours = rc.neighbors();
    Iterator<RiverCrossing> iter = neighbours.iterator();
  }
}
