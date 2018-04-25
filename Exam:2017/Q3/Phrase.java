import java.util.*;
/**
 * 2017 number 3 Phrase
 *
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Apr. 25, 2018
 */
public class Phrase
{
    private String currentPhrase;
    
    /** Constructs a new Phrase object. */ 
    public Phrase(String p)
    {
        currentPhrase = p; 
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
    * returns -1 if the nth occurrence does not exist.
    * Precondition: str.length() > 0 and n > 0
    * Postcondition: the current phrase is not modified.
    */
    public int findNthOccurrence(String str, int n)
    { 
        String temp = currentPhrase;
        int index = -1; // the thing to be returned
        int var = 0; // the number of appearance
        int whatever = 0; // later index = whatever if possible
        
            while (whatever < currentPhrase.length()-str.length())
            {
                if (str.equals(currentPhrase.substring(whatever, whatever+str.length())))
                {
                    var ++;
                    if (var == n)
                    {
                        index = whatever;
                    }
                }
                whatever ++;
            }
        
        return index;
    }
    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
    * If the nth occurrence does not exist, the current phrase is unchanged.
    * Precondition: str.length() > 0 and n > 0 */
    public void replaceNthOccurrence(String str, int n, String repl)
    { 
        int index=findNthOccurrence(str,n);
        if (index>=0)
        {
            currentPhrase=currentPhrase.substring(0,index)+repl+currentPhrase.substring(index+str.length());
        }
    }
    
    /** Returns the index of the last occurrence of str in the current phrase;
    * returns -1 if str is not found.
    * Precondition: str.length() > 0
    * Postcondition: the current phrase is not modified.
    */
    public int findLastOccurrence(String str)
    { 
        int count=0;
        for (int i=currentPhrase.length()-str.length();i>0;i--)
            if(currentPhrase.substring(i,i+str.length()).equals(str))
            return i;
        return -1;
    }
    /** Returns a string containing the current phrase. */ 
    public String toString()
    { 
        return currentPhrase; 
    }
}
