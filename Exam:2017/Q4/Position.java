
/**
 * Write a description of class Position here.
 *
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Apr.25, 2017
 */
public class Position
{
    /** Constructs a Position object with row r and column c. */ 
    public Position(int r, int c)
    {/* implementation not shown */ }
    // There may be instance variables, constructors, and methods that are not shown. 
    
    /** Returns the position of num in intArr;
    * returns null if no such element exists in intArr. * Precondition: intArr contains at least one row. */
    public static Position findPosition(int num, int[][] intArr)
    {
        int row;
        int column;
        for(int r=0;r<intArr.length;r++)
        {
            for(int c=0;c<intArr[r].length;c++)
                if (intArr[r][c]==num)
                {row=r;
                 column=c;
                 return new Position (row, column);
                }
        }
        return null;
    }
    
    /** Returns a 2D successor array as described in part (b) constructed from intArr.
    * Precondition: intArr contains at least one row and contains consecutive values.
    * Each of these integers may be in any position in the 2D array.
    */
    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][]successor=new Position[intArr.length][intArr[0].length];
        for (int r=0;r<intArr.length;r++)
            for(int c=0; c<intArr[r].length;c++)
            {
                successor[r][c]=findPosition(intArr[r][c]+1,intArr);
            }
        return successor;
    }
}
