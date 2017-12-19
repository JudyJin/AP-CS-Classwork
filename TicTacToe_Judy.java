import java.util.*;
/**
 * This program is aimed at performing a simple Tic-Tac-Toe game.
 *
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Nov. 22, 2017
 */
public class TicTacToe_Judy
{
    private static String[][]board;
    private static final int ROWS=3;
    private static final int COLS=3;
    public TicTacToe_Judy()
    {
        board=new String [ROWS][COLS];
        for (int r=0;r<ROWS;r++)
            for(int c=0;c<COLS;c++)
                board [r][c]=" ";
    }
    public void makeMove(int r, int c, String symbol)
    {
        board[r][c]=symbol;
    }
    public String toString()
    {
        String bo="";
        for (int r=0;r<ROWS;r++)
        {    for(int c=0;c<COLS;c++)
              bo=bo+"|"+board[r][c];
             bo=bo+"|\n";
        }
        return bo;
    }
    public static void main()
    {
        TicTacToe_Judy game=new TicTacToe_Judy();
        String player1="o";
        String player2="x";
        System.out.println("Player1's chess is o; Player 2's chess is x");
        for (int i=0;i<4;i++)
        {
            Scanner in=new Scanner(System.in);
            int r=0;
            int c=0;
            //Player 1's turn.
            do
            {
                System.out.print("Player 1: \nEnter the row: ");
                r=in.nextInt()-1;
                System.out.print("Enter the col: ");
                c=in.nextInt()-1;
            }
            while (r>2||r<0||c>2||c<0||board[r][c].equals("o")||board[r][c].equals("x"));
            game.makeMove(r,c,player1);
            System.out.println(game.toString());
            //Exam whether player 1 wins the game.
            if (board[r][0].equals("o")&&board[r][1].equals("o")&&board[r][2].equals("o")||board[0][c].equals("o")&&board[1][c].equals("o")&&board[2][c].equals("o"))
            {   
                System.out.println("Player 1 wins the game.");
                break;
            }
            else if (board[0][0].equals("o")&&board[1][1].equals("o")&&board[2][2].equals("o")||board[0][2].equals("o")&&board[1][1].equals("o")&&board[2][0].equals("o"))
            {
                System.out.println("Player 1 wins the game.");
                break;
            }
            //Player 2's turn.
            do
            {
                System.out.print("Player 2: \nEnter the row: ");
                r=in.nextInt()-1;
                System.out.print("Enter the col: ");
                c=in.nextInt()-1;
            }
            while (r>2||r<0||c>2||c<0||board[r][c].equals("o")||board[r][c].equals("x"));
            game.makeMove(r,c,player2);
            System.out.println(game.toString());
            //Exam whether player 2 wins the game.
            if (board[r][0].equals("x")&&board[r][1].equals("x")&&board[r][2].equals("x")||board[0][c].equals("x")&&board[1][c].equals("x")&&board[2][c].equals("x"))
            {   
                System.out.println("Player 2 wins the game.");
                break;
            }
            else if (board[0][0].equals("x")&&board[1][1].equals("x")&&board[2][2].equals("x")||board[0][2].equals("x")&&board[1][1].equals("x")&&board[2][0].equals("x"))
            {
                System.out.println("Player 1 wins the game.");
                break;
            }
            if (i==3)
            System.out.println("Tied.");
        }
    }
}