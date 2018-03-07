import java.util.*;
/**
 * This is a library Item class.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar.6, 2018
 */
public class LibraryItem
{
    public String title;
    public String author_artist;
    public int ID;
    public boolean onLoan;
    public Date dueDate;
    public LibraryItem()
    {
        title=" ";
        author_artist=" ";
        ID=000;
        onLoan=false;
        dueDate=new Date();
    }
    public LibraryItem(String itemTitle, String itemA, int itemID, boolean loan, Date date)
    {
        title=itemTitle;
        author_artist=itemA;
        ID=itemID;
        loan=onLoan;
        dueDate=date;
    }
    public void printDetails()
    {
        System.out.println("Title: "+this.title+"\nAuthor: "+this.author_artist+"\nID: "+this.ID);
        if (onLoan==true)
            System.out.println(this.title+" is on loan");
        else 
            System.out.println(this.title+" is not on loan");
        System.out.println(this.title+" is due on "+this.dueDate+"\n");
    }
}
