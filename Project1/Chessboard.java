import java.util.*;
/**
 * This class aimed at generating, processing, and judging the game.
 *
 * @Judy Jin
 * @Date: Dec.27, 2017
 * @Instructor: Daneil Gunn
 * @1.0 
 */
public class Chessboard
{   public static String[][]board;
    public static final int ROWS=8;
    public static final int COLS=8;
    public Chessboard()
    {
        board=new String [ROWS][COLS];
        for (int r=0;r<ROWS;r++)
            for(int c=0;c<COLS;c++)
                board [r][c]=" ";
    }
    public static String King="K";
    public static String Queen="Q";
    public static String Rook="R";
    public static String Bishop="B";
    public static String Knight="N";
    public static String Pawn="P";
    public static String King2="K";
    public static String Queen2="Q";
    public static String Rook2="R";
    public static String Bishop2="B";
    public static String Knight2="N";
    public static String Pawn2="P";
    public String[][] set()
    {
        for (int i=0;i<COLS;i++)
        {   board[1][i]=Pawn;
            board[6][i]=Pawn2;
        }
        board[0][0]=Rook;
        board[0][7]=Rook;
        board[7][0]=Rook2;
        board[7][7]=Rook2;
        
        board[0][1]=Knight;
        board[0][6]=Knight;
        board[7][1]=Knight2;
        board[7][6]=Knight2;
        
        board[0][2]=Bishop;
        board[0][5]=Bishop;
        board[7][2]=Bishop2;
        board[7][5]=Bishop2;
        
        board[0][3]=Queen;
        board[7][3]=Queen2;
        board[0][4]=King;
        board[7][4]=King2;
        return board;
    }
    public String toSet()
    {
        String bo="";
        set();
        for (int r=0;r<ROWS;r++)
        {   for(int c=0;c<COLS;c++)
                bo=bo+"|"+board[r][c];
            bo=bo+"|\n";
        }
        return bo;
    }


    public static String winner()
    {
        for (int r=0;r<ROWS;r++)
            for(int c=0;c<COLS;c++)
                if (board [r][c]=="K"&&r<4)
                    return "Player 1 wins.";   
        return "Player 2 wins.";        
    }

    
    public String toString()
    {
        String bo="";
        for (int r=0;r<ROWS;r++)
        {   for(int c=0;c<COLS;c++)
                bo=bo+"|"+board[r][c];
            bo=bo+"|\n";
        }
        return bo;
    }
    public  String makeMove1()
    {
        System.out.print("Player 1: \nWhich do you want to move?");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r=in.nextInt()-1;
        System.out.print("Enter the col: ");
        int c=in.nextInt()-1;
        
        System.out.print("Enter the final position:");
        System.out.print("Enter the row: ");
        int rr=in.nextInt()-1;
        System.out.print("Enter the col: ");
        int cc=in.nextInt()-1;
        board[rr][cc]=board[r][c];
        board[r][c]=" ";
        return toString();
    }
    public  String makeMove2()
    {
        System.out.print("Player 2\n: Which do you want to move?");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r=in.nextInt()-1;
        System.out.print("Enter the col: ");
        int c=in.nextInt()-1;
        
        System.out.print("Enter the final position:");
        System.out.print("Enter the row: ");
        int rr=in.nextInt()-1;
        System.out.print("Enter the col: ");
        int cc=in.nextInt()-1;
        board[rr][cc]=board[r][c];
        board[r][c]=" ";
        
        return toString(); 
    }
}
