import java.util.*;
/**
 * This program is aimed at using recursion to calculate factorial, fibonacci series, numbers of zeros, and to read off the number in English.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gun
 * @Version: 1.0 
 * @Date: Oct.24, 2017
 */
public class recursion_Judy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n=in.nextInt();
        System.out.println("The factorial for "+n+" is: "+factorial(n));
        System.out.println("The "+n+" terms of Fibonacci Series is: "+fibonacci(n));
        System.out.println("The numbers of zeros are: "+num(n));
        System.out.println("The number you entered is: "+number(n));
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
    public static int num(int n)
    {
        if (n>=10)
        {
            if (n%10==0)
            return num(n/10)+1;
            else 
            return num(n/10);
        }
        else if(n==0)
            return 1;
        return 0;
    }
    public static String number(int n)
    {
        if (n==0)
            return "";
        else
        {
            if(n%10==0)
                return number(n/10)+"Zero ";
            else if(n%10==1)
                return number(n/10)+"One ";
            else if(n%10==2)
                return number(n/10)+"Two ";
            else if(n%10==3)
                return number(n/10)+"Three ";
            else if(n%10==4)
                return number(n/10)+"Four ";
            else if(n%10==5)
                return number(n/10)+"Five ";
            else if(n%10==6)
                return number(n/10)+"Six ";
            else if(n%10==7)
                return number(n/10)+"Seven ";
            else if(n%10==8)
                return number(n/10)+"Eight ";
            else if(n%10==9)
                return number(n/10)+"Nine ";
        }
        return "";
    }
}
