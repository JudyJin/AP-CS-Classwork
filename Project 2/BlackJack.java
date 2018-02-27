import java.util.*;
/**
 * Author S3C7 Judy Jin & Steven Jin
 * Instructor: Daniel Gunn
 * Date: Feb 18, 2018
 * Brief instruction: This program is a BlackJack game.
 */
public class BlackJack
{
    public static void makeDeck(Deck tdeck)
    {
        String[] a = {"Spade", "Heart", "Diamond", "Club"};
        String[] b = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int j;
        for(String ts: a)
        for(j = 0; j < 13; j ++)
            tdeck.add(ts, b[j], v[j]);
    }
    public static int choice(int A)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What value would you use for A(1,11): "); 
        int choice = input.nextInt();
        if(choice==1)
            A=1;
        else if(choice==11)     
            A=11;
        return A;
    }
    public static int compChoice(int A, int Compsum)
    {
        if (Compsum<=10)
            A=1;
        else
            A=11;
        return A;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        makeDeck(deck);
        deck.shuffle();
        
        //BlackJack initialization 
        int count=0;
        int Compsum=0;
        int Playersum=0;
        int CompCount=1;
        int PlayerCount=1;
        int play;
        System.out.println("Welcome to Black Jack");
        
        do {
            //First dealer's turn
            int Computer= deck.cards[count].value;
            String Com= deck.cards[count++].name;
            System.out.println("\nDealer turn 1: " + Com);
            //Number definded for computer
            if (Computer==1)
                Computer=compChoice(Computer,Compsum);
            Compsum+=Computer;
        
            //First player's turn
            int Player=deck.cards[count].value;
            String player= deck.cards[count++].name;
            System.out.println("\nPlayer turn 1 : " + player);
            //Number definded for player
            if (Player==1)
                Player=choice(Player);
                Playersum+=Player;
        
            for(CompCount=2;CompCount<=5&&Compsum<=17;CompCount++)
            {
                Computer=deck.cards[count++].value;
                System.out.println("\nDealer turn " + CompCount+ ": hide" );
                if (Computer==1)
                    Computer=compChoice(Computer,Compsum);
                    Compsum+=Computer;
            }
    
            for(PlayerCount=2;PlayerCount<=5;PlayerCount++)
            {
                Player=deck.cards[count].value;
                player= deck.cards[count++].name;
                System.out.println("\nPlayer turn " + PlayerCount+": " +player);
                //Number definded for player
                if (Player==1)
                    Player=choice(Player);
                Playersum+=Player;
                System.out.println("\nPlayer's total: "+Playersum);
            
                if (Playersum<=21)
                {
                System.out.print("\nDo you want to do next hit(true/false): ");
        
                boolean next=input.nextBoolean();
         
                if(next== true)
                    continue;
                else
                    break;
                }
                else
                    break;
            }
            if(Compsum<21)
                if(CompCount>=6)
                    System.out.print("\nDealer five small tiger win");
                else
                    System.out.println("\nDealer: " + Compsum);
                else if(Compsum==21)
                if(CompCount>=6)
                    System.out.print("\nDealer five small tiger");
                else
                    System.out.println("\nDealer Blackjack!!!!" );
            else
                System.out.println("\nDealer Boom!");
    
            if(Playersum<21)
                if(PlayerCount>=5)
                    System.out.print("\nPlayer five small tiger");
                else
                    System.out.println("\nPlayer: " + Playersum);
            else if(Playersum==21)
                if(PlayerCount>=5)
                    System.out.print("\nPlayer five small tiger");
                else
                    System.out.println("\nPlayer Blackjack!!!!" );
            else
                System.out.println("\nPlayer Boom!" );
    
            if(Compsum>21)
                System.out.println("\nPlayer win!!!!" ); 
            else if(CompCount==5&&Compsum<=21&&PlayerCount!=5)
                System.out.println("\nDealer win!!!!" ); 
            else if(PlayerCount>=5&&Playersum<=21)
                System.out.println("\nPlayer win!!!!" ); 
            else if(Compsum<=21&&Playersum>21)
                System.out.println("\nDealer win!!!!" ); 
            else if(Compsum<=21&&Playersum<=21&&CompCount<5&&PlayerCount<5)
            {
                if(Compsum<=Playersum)
                    System.out.println("\nPlayer win!!!!" );
                else
                    System.out.println("\nDealer win!!!!" );
            }
            
            System.out.print("\nPress 1 to play again. ");
            play=input.nextInt();
            Compsum=0;
            Playersum=0;
            
            if (count>=44)
            {
                 deck.shuffle();
                 System.out.println("\nDeck Shuffled..."); 
                 count=0;
            }
        }
        while (play==1);
    }
}
       
            
               
        
    
     

