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
    public int BorrowerID;
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
    private static Date addDays(Date date, int days)
    {
        GregorianCalendar cal=new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
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
    public String getTitle()
    {
        return title;
    }
    public String getA()
    {
        return author_artist;
    }
    public int getItemID()
    {
        return ID;
    }
    public boolean getOnLoan()
    {
        return onLoan;
    }
    public Date getDueDate()
    {
        return this.dueDate;
    }
    public void borrowing()
    {
        if (this.onLoan==true)
            System.out.println(this.title+" is on loan.\n");
        else 
        {
            this.onLoan=true;
            System.out.println("You have borrowed "+this.title);
            Date today=new Date();
            this.dueDate=addDays(today, 14);
            System.out.println(title+" is due on "+this.getDueDate()+"\n");
        }
    }
    public void returning()
    {
        if (this.onLoan==false)
        {   
            this.onLoan=true;
            System.out.println("You have returned "+this.title+"\n");
        }
        else 
        {
            System.out.println(this.title+" is not on loan\n");
        }
    }
}
