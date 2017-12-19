import java.util.*;
/**
 * This program is aimed at simulating an ATM machine.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Sep. 26, 2017
 * @Version: 2.0
 *           Changing if to switch.
 */
public class ATM_Program_Judy_2
{
   public static void main()
   {
       double account=2500.25;
       Scanner in=new Scanner(System.in);
       
       System.out.println("Welcome!\n\nWithdraw cash:\t\t1\nMake a deposit:\t\t2\nCheck your balance:\t3\nExit:\t\t\t4\nEnter the number for your transaction.");
       int choice=in.nextInt();
       
      switch (choice)
      {    case 1: 
                System.out.println("Enter the amount of money you want to withdraw: ");
                double withdraw=in.nextDouble();
                account-=withdraw;
                System.out.println("You have withdrawn $"+withdraw+". Your account has $"+account+" now.");
                break;
           case 2:
                System.out.println("Enter the amount of money you want to deposit: ");
                double deposit=in.nextDouble();
                account+=deposit;
                System.out.println("You have deposited $"+deposit+". Your account has $"+account+" now.");
                break;
           case 3:
                System.out.println("Your account has $"+account+" now.");
                break;
           case 4:
                System.out.println("Thank you for using our ATM.");
                break;
           default:
                System.out.println("Error.");
       }
   }
}
