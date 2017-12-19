import java.util.*;
/**
 * This program is aimed at calculating the charge for shoping.
 *
 * @Author: Judy
 * @Instructor: Daniel Gunn
 * @Sep. 20, 2017 
 */
public class ShippingCharge_Judy
{
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the weight of the package in pounds: ");
        double weight=input.nextDouble();
        System.out.print("Enter the shipping price per pound: $");
        double price=input.nextDouble();
        
        double total=weight*price;
        total= (int) ((total+0.005)*100);
        total=total/100;
     
        System.out.println("You need to pay $"+total); 
    }
}
