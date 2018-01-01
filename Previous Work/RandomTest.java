import java.util.*;
/**
 * This program is aimed at testing the random generator.
 *
 * @Author: Judy Jin
 * @Version: 1.0
 */
public class RandomTest
{
    public static void main()
    {
        int[]Array=new int[10];
        for (int i=0; i<1000; i++)
        {  
             int number =(int)(10*Math.random());
             Array[number]=Array[number]+1;
        }
        for (int i=0;i<10;i++)
        {   System.out.println("The numbers for "+i+" "+Array[i]);
            System.out.println("The percentage for number "+i+" is "+ ((double) Array[i]/1000));
         }
    }
}
