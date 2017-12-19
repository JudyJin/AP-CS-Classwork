import java.util.*;
/**
 * This program is aimed at inserting a value while preserving the order.
 *
 * @Author：Judy Jin
 * @Insturctor: Daniel Gunn
 * @Date: Nov.13, 2017 
 */
public class insertVaule
{
    public static void main()
    {
        int [] array = {1,2,3,5,7,8,14,15,0,0,0};
        System.out.print("Please enter the number you want to insert: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        insert(array,0,n);
    }
    public static boolean insert (int[]arr, int count,int value)
    {
        for (int i=0;i<arr.length;i++)
        {
            while(value>arr[count])
            {
                count++;
                if(arr[count]==0)
                    break;
            }
            for(int j=arr.length-1;j>count;j--)
                    arr[j]=arr[j-1];
                arr[count]=value;
            System.out.println(Arrays.toString(arr));
                return true;
        }
        return false;
    }
}
