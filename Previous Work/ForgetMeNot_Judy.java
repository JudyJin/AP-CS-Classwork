import java.util.*;
/**
 * This program gives you a series of "I miss You" with "Love, me" at the end.
 *
 * @Auther: Judy Jin 
 * @Instructor: Daniel Gunn
 * @Version: 1.0
 */
public class ForgetMeNot_Judy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the numbers of time you miss her or him: ");
        int times=in.nextInt();
        missYou(times);
        System.out.println("Love, me.");
    }
    public static void missYou(int n)
    {
        if (n==0)
        return;
        System.out.println("I miss you!!");
        missYou(n-1);
        return;
    }
}