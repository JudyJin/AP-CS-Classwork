import java.util.*;
/**
 * This program is aimed at finding a positive number.
 *
 * @Athour: Judy Jin
 * @Version: 1.0
 */
public class Positive_number
{
    public static int positive()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int number=in.nextInt();
        if (number>0)
         return number;
        else
         return positive();
    }
    public static void main()
    {
        System.out.println("Your positive number is "+positive());
    }
}