import java.util.Scanner;
/**
 * This program can allow user play rock-scissors-paper with the computer.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Sep. 20, 2017
 */
public class PaperScissorsRock2_Judy
{
    public static void main()
    {
       
        Scanner input= new Scanner(System.in);
        System.out.println("Paper=0, Scissors=1, Rock=2");
        System.out.print("Enter your choice: "); 
        
        int player=input.nextInt();
        double computer= (int) (3*Math.random());
        
        System.out.println(" ");
        
        if(computer==0)
            System.out.println("Computer chooses Paper.");
        else if(computer==1)
            System.out.println("Computer chooses Scissors.");
        else if(computer==2)
            System.out.println("Computer chooses Rock.");
        
        if(player==0)
            System.out.println("You choose Paper.");
        else if(player==1)
            System.out.println("You choose Scissors.");
        else if(player==2)
            System.out.println("You choose Rock.");
        
        System.out.println(" ");
        
        if (player>2)
            System.out.println("Invalid input.");
        else if(player==computer)
            System.out.println("Tied.");
        else if ((player==2 && computer==0) || (player==0 && computer==1)||( player==1 && computer==2))
            System.out.println("You Lose.");
        else 
            System.out.println("You Win！！！");
        
        System.out.println(" ");
        
    }
}

