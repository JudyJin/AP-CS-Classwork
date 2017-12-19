import java.util.*;
/**
 * This program can give you the price you need to pay according to the discount.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Version: 1.0
 */
public class Price
{
    public static void main()
    {
        double cost=cost(12020,0.1);
        System.out.println("The money you need to pay is "+cost);
    }
    public static double cost(double price, double discount)
    {
        double cost=price*discount;
        return cost;
    }
    public static double cost(double price, int discount)
    {
        double cost=price*discount/100;
        return cost;
    }
}
