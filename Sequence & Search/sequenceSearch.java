import java.util.*;
/**
 * This program is aimed at searching the index of a given int.
 *
 * Author: Judy Jin
 * Date: Nov.14, 2017
 */
public class sequenceSearch
{
    /**
     * @param arr a two dimensional array to search in
     * @param value the value to search for
     * @return the index row and column of the found item
     */
    public static int[] linear_search(int[][]arr, int value)
    {
        int result[]=new int [2];
        int i=0;
        int j=0;
        for (;i<arr.length;i++)
        {
            for(;j<arr[i].length;j++)
                if (value==arr[i][j])
                {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
        }
        result[0]=-1;
        result[1]=-1;
        return result;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int search[][]={{1,5},{2,3,22,4,7}};
        System.out.print("Input the number you want to search for: ");
        int num=in.nextInt();
        int result[]=linear_search(search,num);
        System.out.println(Arrays.toString(result));
    }
}
