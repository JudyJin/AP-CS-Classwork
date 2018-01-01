import java.util.*;
/**
 * Trying to print a series of pattern.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Version: 2.0 
 * @Date: Sep. 27, 2017
 */
public class Print_Judy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please input the length of final line");
        int line=in.nextInt();
        
        for (int a=1; a<=line; a++)
        {
             for (int b =1; b<=a; b++)
                System.out.print("*");
             System.out.println();
        }
    }
}