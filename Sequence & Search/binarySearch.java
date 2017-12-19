
/**
 * This program aimes at operating binary search.
 *
 * @Author: Judy Jin 
 * @Instructor: Daniel Gunn
 * @Version: 1.0 
 * @Date: Oct.25, 2017
 */
public class binarySearch
{
    public static int[]list={1,4,7,8,10,15};
    public static int binSearch (int target, int lowerindex, int upperindex)
    {
        if (lowerindex==upperindex)
        {
            if (target==list[lowerindex])
                return lowerindex;
            else 
                return -1;
        }
        int midi=(int)(upperindex+lowerindex)/2;
        if (target==list[midi])
            return midi;
        else if (target<list[midi])
            binSearch(target,lowerindex, midi);
        else if (target>list[midi])
           binSearch(target,midi,upperindex);
        
        return -1;
    }
        public static int binsearch (int target, int lowerindex, int upperindex)
    {
        if (lowerindex <= upperindex)
        {if (target==list[(upperindex+lowerindex)/2])
            return (upperindex+lowerindex)/2;
        else if (target<list[(upperindex+lowerindex)/2])
             return binsearch(target,lowerindex,((upperindex+lowerindex)/2)-1);
        else 
             return binsearch(target,((upperindex+lowerindex)/2)+1, upperindex);}
        else
            return -1;
    }
    public static void main()
    {
       // if (target==list[(upperindex+lowerindex)/2])
         //   return (upperindex+lowerindex)/2;
           // else if (target<list[(upperindex+lowerindex)/2])
           // binSearch(target,lowerindex, (int)(upperindex+lowerindex)/2);
           // else if (target>list[(upperindex+lowerindex)/2])
          // binSearch(target,(int)(upperindex+lowerindex)/2, upperindex);
    }
}
