import java.util.Scanner;
import java.lang.Math;
/**
 * This program is aimed at calculating the monthly mortages.
 * It needs the user to input the interest rate, number of years, and loan amount.
 * It will compute monthly payment and total payment.
 *
 * @Judy
 * @S3C7_Section A
 * @Mr. Daniel Gunn
 * @Sep.14, 2017
 */
public class Mortage_Judy extends PaperScissorsRock2_Judy
{   public static void main()
    {
       Scanner input=new Scanner(System.in);
       
       System.out.print("The amount of your loan: ");
       Double loan =input.nextDouble();
       System.out.print("The number of years: ");
       Double years= input.nextDouble();
       System.out.print("What is the interest rate: ");
       Double rate = input.nextDouble();

       Double monthly= (loan*rate)/(1-(1/Math.pow((1+rate),years*12)));
       Double total = monthly*years*12;
       System.out.println("Your monthly payment is: "+monthly);
       System.out.println("Your total payment is: "+total);
    }
}
