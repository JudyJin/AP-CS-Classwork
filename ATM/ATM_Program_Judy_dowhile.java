import java.util.*;
/**
 * This program is aimed at simulating an ATM machine.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Sep. 26, 2017
 * @Version: 4.0
 *           Using dowhile loop.
 */
public class ATM_Program_Judy_dowhile
{
   public static void main()
   {
       double account=2500.25;
       Scanner in=new Scanner(System.in);
       
       System.out.println("Welcome!\n\nWithdraw cash:\t\t1\nMake a deposit:\t\t2\nCheck your balance:\t3\nExit:\t\t\t4\nEnter the number for your transaction.");
       int choice=in.nextInt();
       
       do
       {   
           switch (choice)
           {   
               case 1: 
                    System.out.println("Enter the amount of money you want to withdraw: ");
                    double withdraw=in.nextDouble();
                    if (withdraw<=account)
                    {
                        account-=withdraw;
                        System.out.println("\nYou have withdrawn $"+withdraw+". Your account has $"+account+" now.");
                    }
                    else
                        System.out.println("\nYou do not have enough money. Your account has $"+account+" now.");
                    break;
               case 2:
                    System.out.println("Enter the amount of money you want to deposit: ");
                    double deposit=in.nextDouble();
                    account+=deposit;
                    System.out.println("\nYou have deposited $"+deposit+". Your account has $"+account+" now.");
                    break;
               case 3:
                    System.out.println("\nYour account has $"+account+" now.");
                    break;
               case 4:
                    System.out.println("\nDo you really want to exit?");
                    break;
               default:
                    System.out.println("\nInput error.\nPleases enter your choice from 1 to 4.");
           }
           System.out.println("\n\nWithdraw cash:\t\t1\nMake a deposit:\t\t2\nCheck your balance:\t3\nExit:\t\t\t4\nEnter the number for your transaction.");
           choice=in.nextInt(); 
       }
       while(choice!=4);
       System.out.println("\nThank you for using our ATM.");
   }
}
