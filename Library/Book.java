import java.util.*;
/**
 * This is a Book class.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar.6, 2018
 */
public class Book extends LibraryItem
{
    public boolean isRequested;
    public Book()
    {
        super();
        isRequested=false;
    }
    public Book(String bookTitle, String Author, int bookID, boolean loan, Date due, boolean request)
    {
        super(bookTitle, Author, bookID, loan, due);
        isRequested=request;
    }
    public void printDetails()
    {
        System.out.println("Book Title: "+this.title+"\nAuthor: "+this.author_artist+"\nBook ID: "+this.ID);
        if (onLoan==true)
            System.out.println(this.title+" is on loan");
        else 
            System.out.println(this.title+" is not on loan");
        System.out.println(this.title+" is due on "+this.dueDate);
        if (isRequested==true)
            System.out.println(title+" is requested");
        else 
            System.out.println(title+" is not requested\n");
    }
    public boolean getIsRequested()
    {
        return isRequested;
    }
    public void setIsRequested()
    {
        boolean r;
        Scanner s=new Scanner(System.in);
        if (this.isRequested==true)
        {    
            System.out.println(this.title+" is already requested. Do you want to cancel the request?");
            r=s.nextBoolean();
            if (r==true)
                isRequested=false;
        }
        else
            isRequested=true;
    }
}
