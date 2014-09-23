
/***********************************************
 * This is the solver class.
 * It takes in the input from stdIn.
 * It generates the city objects from stdIn.
 * It runs the algorithms to solve the TSP.

 @author : Dharani Manne
 @author : Goutam Rajiv
***********************************************/

/*****************************************************************************************
 * Algorithm:
 *
 * We maintain a open boolean list, which tells us if a city is visited or not.
 * We start with a city, generate children, pick the best child and move to it.
 * Best Child => Child with least distance from parent.
 * We should try to optimize the moveGen() function so that less children are generated.
 * Typical moveGen() function will be to generate all nodes which are not visited.
 * We keep moving, while saving the order of cities in another list.
 * Instead of 2 lists, we can have a list which stores the id of cities visited.
 * This list will give us the order in which the cities are visited.
 * The algorithm terminates if all cities are visited.
*****************************************************************************************/

public class Solver
{

  public Solver()
  {
    //Rajiv, please do write the code to create city objects over here, reading from the stdIn.  
    //If you want to maintain a 2D matrix for distances, we can do that here.
    //Else, we can keep a 1D matrix in each city object.
  
    //Complete this soon so that we can finish the greedy algorithm by tonight.
  }

}
