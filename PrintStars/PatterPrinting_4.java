import java.util.*;
/**
 * Trying to print a series of pattern.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Version: 4.0 
 * @Date: Sep. 27, 2017
 */
public class PatterPrinting_4
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Please input the length of final line: ");
        int number=in.nextInt();
        
        if (number%2!=0 && number>=0)
        {
            int line=(number+1)/2;
            for (int a=1; a<=line; a++)
            {
                for (int space=0; space<line-a; space++)
                    System.out.print(" ");
                for (int b=1; b<=(a*2)-1; b++)
                    System.out.print("*");
                System.out.println();
            } 
        }
        else
            System.out.println("Input Invalid");
    }
}