import java.util.*;
/**
 * This is a CD class.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar.6, 2018
 */
public class CD extends LibraryItem
{
    public String Genre;
    public CD()
    {
        super();
        Genre="Jazz";
    }
    public CD(String CDTitle, String Artist, int CDID, boolean loan, Date due, String g)
    {
        super(CDTitle, Artist, CDID, loan, due);
        Genre=g;
    }
    public void printDetails()
    {
        System.out.println("CD Title: "+this.title+"\nArtist: "+this.author_artist+"\nGenre: "+this.Genre+"\nCD ID: "+this.ID);
        if (onLoan==true)
            System.out.println(this.title+" is on loan");
        else 
            System.out.println(this.title+" is not on loan");
        System.out.println(this.title+" is due on "+this.dueDate+"\n");
    }
    public String getGenre()
    {
        return this.Genre;
    }
    public void setGenre(String r)
    {
        this.Genre=r;
    }
}
