import java.util.*;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    private int travel=0;
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        
        String response = "";
        if (statement.indexOf("no ") >= 0
                || statement.indexOf("NO")>=0
                || statement.indexOf(" no")>=0)
        {
            response = "Why so negative?";
        }
        else if (travel>0)         
            response=getTips(statement);
        else if (statement.indexOf("have been to")>=0
                || statement.indexOf("travel")>=0
                || statement.indexOf("world")>=0
                || statement.indexOf("trip")>=0)
        {
            response=getRandomTrip();
        }

        
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    private String getRandomTrip()
    
    {
        double r = Math.random();
        String[] responses={"I like travelling, do you want to go to some place?",
        "Hmmm. How about telling me your next travel plan", 
        "Ask me about a country, and I can give you some tips!!",
        "Tell me more about your thoughts about travelling"};
        int whichResponse = (int)(r *responses.length);
        travel+=1;
        return responses[whichResponse];
    }
    private String getTips(String statement)
    
    {
        String response = "";
        if (statement.indexOf("iceland")>=0)
            response= "Iceland is a great place!!! I want to go there too, but it's too cold";
        else if (statement.indexOf("beijing")>=0)
            response= "Beijing is a big city! I live in Beijing. If you want to go there, I would recommend you to go to Happy Valley";
        travel-=1;
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        double r = Math.random();
        String[] responses={"Interesting, tell me more.",
        "Hmmm.", "Do you really think so?","You don't say.","So true"};
        int whichResponse = (int)(r*responses.length);
        return responses[whichResponse];
    }
}