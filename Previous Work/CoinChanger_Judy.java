import java.util.*;
/**
 * This program is aimed at counting the coin changer.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Version: 1.0
 */
public class CoinChanger_Judy
{
   public static void coinChanger(int amount)
   {
       if (amount>50)
       { int halfDollar=amount/50;
         amount=amount-50*halfDollar;
         System.out.println(halfDollar+" half dollar. ");
       }
       if (amount>25)
       {int quarter=amount/25;
        amount=amount-25*quarter;
        System.out.println(quarter+" quarter. ");
       }
       if (amount>10)
       {int dime=amount/10;
        amount=amount-10*dime;
        System.out.println(dime+" dime. ");
        }
       if (amount>5)
       {int nickel=amount/5;
        amount=amount-nickel*5;
        System.out.println(nickel+" nickel. ");
       }
       if (amount>1)
       {int penny=amount;
        System.out.println(penny+" penny.");
       }
   }
   public static void main()
   {
       Scanner in=new Scanner(System.in);
       System.out.print("Enter the total cents: ");
       int amount=in.nextInt();
       coinChanger(amount);
   }
}
