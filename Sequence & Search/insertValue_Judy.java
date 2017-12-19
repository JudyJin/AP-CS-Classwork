import java.util.*;
/**
 * This program is aimed at inserting a value into the array while preserving the sequence.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Nov.9, 2017
 */
public class insertValue_Judy
{
    public static void main()
    {
        int []a={1,2,5,7,20,45,0,0,0};
        System.out.print("Please enter the number you want to insert: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        for (int i=0;i<a.length;i++)
        { 
            if(n<a[i])
            {
                for(int j=a.length-1;j>i;j--)
                    a[j]=a[j-1];
                a[i]=n;
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
