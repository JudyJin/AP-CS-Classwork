import java.util.*;
/**
 * This program is aimed at searching the index of a given int using binary search.
 *
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Nov.14, 2017
 */
public class binSearch_Judy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int search[]={1,5,8,10,17,19,40,57,67};
        System.out.println(Arrays.toString(search));        
        System.out.print("Input the number you want to search for: ");
        int num=in.nextInt();
        System.out.println("The index of the value is: "+binSearch(search,num));
    }
    /**
     * @param arr an ordered on dimensional array
     * @param value the value to search for
     * @return the index of that value was at
     */
    public static int binSearch(int[]arr, int value)
    {
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(value!=arr[mid])
        {
            if(low>=high)
                return -1;
            if(value>arr[mid])
                low=mid+1;
            else if(value<arr[mid])
                high=mid-1;
            mid=(low+high)/2;
        }
        return mid;
    }
}
