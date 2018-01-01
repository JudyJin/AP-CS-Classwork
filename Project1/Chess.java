import java.util.*;
/**
 * Main method of the chess game.
 *
 * @Judy Jin
 * @1.0
 */
public class Chess
{
    public static void main()
    {
        Chessboard game=new Chessboard();
        System.out.println(game.toSet());
        
        while(true)
        {  
            int count=0;
            for (int r=0;r<game.ROWS;r++)
                for(int c=0;c<game.COLS;c++)
                    if (game.board [r][c]=="K")
                        count++; 
            if (count==2)
            {
                System.out.println(game.makeMove1());
                System.out.println(game.makeMove2());
            }
            else 
            {   System.out.println(game.winner());
                break;
            }
        }
    }
}


