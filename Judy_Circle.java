import java.util.Scanner;
import java.lang.Math;
/**
 * This is Judy's Circle.
 *
 * @Judy Jin 
 * @Sep.14 
 */
public class Judy_Circle
{   public static void main()
    {
       Scanner input=new Scanner(System.in);
       
       System.out.print("Enter radius: ");
       Double Radius = input.nextDouble();
       Double Circumference= Radius *2*Math.PI;
       Double Area= Math.pow(Radius,2) *Math.PI;

       System.out.println("The circumference for Judy's Circle is "+Circumference+". ");
       System.out.println("The area for Judy's circle is " +Area+ ".");
        
    }
    
}
