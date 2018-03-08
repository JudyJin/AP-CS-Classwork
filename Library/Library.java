import java.util.*;
/**
 * This is a library main class.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar.6, 2018
 */
public class Library
{
    public static void main ()
    {
        Date d= new Date();
        Book b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        LibraryItem cd = new CD("And Justice for all", "Metallica", 345, false, new Date(), "Metal");
        cd.printDetails();
      
        b.borrowing();
        System.out.println(b.title+" is due on "+b.getDueDate());
        b.printDetails();
        b.setIsRequested();
        b.setIsRequested();
    }
}
