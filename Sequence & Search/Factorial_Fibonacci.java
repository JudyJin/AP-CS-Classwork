import java.util.*;
/**
 * This program is aimed at calculating the factorial of N.
 *
 * @Author: Judy Jin 
 * @Instructor: Daniel Gunn
 * @Version: 1.0 
 * @Date: Oct.24, 2017
 */
public class Factorial_Fibonacci
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the number N: ");
        int n=in.nextInt();
        factorial(n);
        System.out.println("The answer is: "+factorial(n));
        System.out.println("The answer is: "+fibonacci(n));
    }
    public static int factorial(int number)
    {
        if (number==1)
            return number;
        else 
            return factorial(number-1)*number;
    }
    public static int fibonacci(int number)
    {
        if (number>2)
            return fibonacci(number-1)+fibonacci(number-2);
        else if (number==2)
            return 1;
        else 
            return 0;
    }
}