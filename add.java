import java.util.*;
/**
 * Write a description of class add here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class add
{
     public static void main()
     {
         Scanner in=new Scanner(System.in);
         System.out.println("This calculator can give you the result for the sum from 1 to n.");
         System.out.print("Please enter a number: ");
         int num=in.nextInt();
         addUP(num);
         System.out.println("Your final answer is "+addUP(num));
     }
     public static int addUP(int n)
     {
         if (n==1)
          return 1;
         else
          return addUP(n-1)+n;
     }
}
