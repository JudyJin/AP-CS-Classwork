
import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    public static void main ()
    {
        Date d= new Date();
        LibraryItem b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        LibraryItem cd = new CD("And Justice for all", "Metallica", 345, false, new Date(), "Metal");
        cd.printDetails();
        
        b.printDetails();
       

    }
}
