import java.util.*;
/**
 * Find the average of the five integer typed.
 *
 * @Judy Jin
 * @Sep. 19, 2017
 */
public class IntegerAverage_Judy
{
    public static void main()
    {
       Scanner input=new Scanner(System.in);
      
       Double sum=0.0;
       System.out.print("Integer 1: ");
       sum= sum + input.nextDouble();
       System.out.print("Integer 2: ");
       sum= sum + input.nextDouble();
       System.out.print("Integer 3: ");
       sum= sum + input.nextDouble();
       System.out.print("Integer 4: ");
       sum= sum + input.nextDouble();
       System.out.print("Integer 5: ");
       sum= sum + input.nextDouble();
       
       
       System.out.println("The average of the five integers is: "+ sum/5);
    }
}
