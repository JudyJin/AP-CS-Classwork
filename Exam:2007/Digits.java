import java.util.*;
/**
 * 2007 free response #1
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Apr.25, 2018
 */
public class Digits
{
    /** The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number. */
    private ArrayList<Integer> digitList;
    /** Constructs a Digits object that represents num. * Precondition: num >= 0
    */
    public Digits(int num)
    {   digitList=new ArrayList();
        while (num>0)
        {   digitList.add(0,num%10);
            num=num/10;
        }
    }
    /** Returns true if the digits in this Digits object are in strictly increasing order; * false otherwise.
    */
    public boolean isStrictlyIncreasing()
    {   
        for (int i=1;i<digitList.size();i++)
            if(digitList.get(i)<=digitList.get(i-1))
                return false;
        return true;
    }
}