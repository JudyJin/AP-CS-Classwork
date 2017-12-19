import java.util.*;
/**
 * This program is aimed at designing a game that allow the players can choose their own story. 
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Version: 1.0 
 */
public class Choose_your_own_game_Judy
{
    public static void scene1(String name)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Press 1: Go the the left to see the house.\nPress 2: Go to the right to see the lake.\nPress 3: Stay here.");
        int opt1=in.nextInt();
        if (opt1==1)
            scene1_1(name);
        else if (opt1==2)
            scene1_2(name);
        else if (opt1==3)
            scene1_3(name);
    }
    public static void scene1_1(String name)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nYou walk along the forest, towarding the house.\nThe road seems like a never-ending road.\nYou walk and walk and walk.\nFinally you reach the house.\nYou feel very hungry and see a bread put in the front of the door.");
        System.out.println("Press 1: Pick up that bread and eat it.\nPress 2: Knock the door to see if there is someone inside.\nPress 3: Start examining the surrondings."); 
        int opt1_1=in.nextInt();
        if(opt1_1==1)
            {
                System.out.println("\nHow dare you!\nYou eat the bread for the most powerful person in this forest.\nOnly one thing is waiting for you--DEATH, "+name);
            }
        if(opt1_1==2)
            {
               System.out.println("\nYou knock the door.\nA gloomy voice replies you, 'Who are you, noisy fool?'\nPress 1: 'I am "+name+".\nPress 2: 'I am the KING of the forest.'\nPress 3: 'I am getting lost here, can I have your help?'");
               int opt1_1_2=in.nextInt();
               if (opt1_1_2==1)
                     System.out.println("\nThe voice replies, 'How DARE you?? IMPOLIT. Who knows you?'\n'You'd better go away.'\nYou dead, stupid "+name);
               else if (opt1_1_2==2)
                     System.out.println("\nThe voice replies, 'I am the KING. You'd better die. I like to give you a shoot.\nYou dead, stupid "+name);
               else if (opt1_1_2==3)
                     System.out.println("\nThe voice replies, 'I like your response. I will help you to leave this forest.'\nHere is the map for you. Hope not see you again, "+name);
            }
        if(opt1_1==3)
             scene1_1_3(name);
    }
    public static void scene1_1_2(String name)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nYou knock the door.\nA gloomy voice replies you, 'Who are you, noisy fool?'\nPress 1: 'I am "+name+".\nPress 2: 'I am the KING of the forest.'\nPress 3: 'I am getting lost here, can I have your help?'");
        int opt1_1_2=in.nextInt();
        if (opt1_1_2==1)
            System.out.println("\nThe voice replies, 'How DARE you?? IMPOLIT. Who knows you?'\n'You'd better go away.'\nYou dead, stupid "+name);
        else if (opt1_1_2==2)
            System.out.println("\nThe voice replies, 'I am the KING. You'd better die. I like to give you a shoot.\nYou dead, stupid "+name);
        else if (opt1_1_2==3)
            System.out.println("\nThe voice replies, 'I like your response. I will help you to leave this forest.'\nHere is the map for you. Hope not see you again, "+name);
    }
    public static void scene1_1_3(String name)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nSPECIAL FINDINGS!\nYou find a key hanging on the house and a code box.\nPress 1: Pick up the key.\nPress 2: Try the code box.");
        int opt1_1_3=in.nextInt();
        if(opt1_1_3==1)
        {
            System.out.println("\nYou have triggered a bomb.\nYou are dead, stupid "+name);
        }
        if(opt1_1_3==2)
        {
            System.out.println("\nA question appears on the screen.\n'Enter the number you think should be appeared in the next.'\n'2 3 8 63 ?'");
            int code=in.nextInt();
            if (code==3968)
            {
                System.out.println("\nYou are so clever. \nHowever, when you open the box, you find out situation becomes worse.\nThere is another question, \n'Stupic Laura bought a bracelet for $21 which she then resold for $25.");
                System.out.println("She unwisely accepted a cheque from the purchaser for $35 and gave his $10 change.\nShe then gave the cheque to her landlord but it bonced so she had to borrow $35 to pay her rent.'");
                System.out.println("How much money has stupid Laura actually lost?");
                int lost=in.nextInt();
                if(lost==31)
                {
                    System.out.println("\nYou are so clever. I like you "+name+".\nPress 1: Becoming the new KING in the forest.\nPress 2: Get the route for leaving the forest.");
                    int clever=in.nextInt();
                    if (clever==1)
                        System.out.println("\nCongratuations! You are now the KING OF THE FOREST!\n"+name+" Forest.");
                    if (clever==2)
                        System.out.println("\nSeems like you don't like my forest, "+name+"\nYou must die, "+name);
                }
                else
                    System.out.println("\nYou are stupid and you overestimate your ability.\nBomb Boom!!\nYou are dead, "+name);
            }
            else 
            {
                System.out.println("\nYou are stupid and you overestimate your ability.\nBomb Boom!!\nYou are dead, "+name);
            }
        }
    }
    
    public static void scene1_2(String name)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nRoad is always longer than you thought it was.\nYou walk and walk; however, when you think you are near the lake, you find out the lake is further.");
        System.out.println("So, what should you do.\nPress 1: Keep GOING!\nPress 2: Back to the orginal spot");
        int opt2_1=in.nextInt();
        if (opt2_1==1)
            scene1_2_1(name);
        if (opt2_1==2)
            scene1_2_2(name);
    }
    public static void scene1_2_1(String name)
    {
        System.out.println("\nYou are too tired and you find out that you can never reach the lake.\nAlso, you are so hungry that you even do not know you step in a marshland.");
        System.out.println("You are dead, stupid "+name);
    }
    public static void scene1_2_2(String name)
    {
        Scanner in=new Scanner(System.in);
        scene1(name);
    }
    
    public static void scene1_3(String name)
    {
        System.out.println("\nYou stay at the current position for a very long period of time. \nA sense of hunger arise.\nAll of a sudden, a tiger comes towards you.\nYou have no power to deal with the tiger.\nYou wait until the death comes.");
        System.out.println("You are dead, stupid "+name+".");
    }
   
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nHello, welcome to 'Your Stroy Line--Survival'");
        System.out.println("What's your name?");
        String name=in.nextLine();
        int exit;
        do 
        {
            System.out.println(name+", you awake in a dark forest, having nothing with you. \nYou look around to see if you can find something.");
            System.out.println("Nothing around you. \nBut you see something like a house merely very far away in the left and a lake far away in the right.");
     
            scene1(name);
            System.out.println("\nYou can enter 1 to continue this game.");
            exit=in.nextInt();
        }
       
        while (exit==1);
    }   
}


