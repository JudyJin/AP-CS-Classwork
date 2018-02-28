import java.util.*;
/**
 * A Program for bicycle.
 * Instructor: Daniel Gunn
 * Author: Judy Jin
 * Date: Feb 27, 2018
 */
public class bicycle
{
    public double tyreRadius;
    public String frameSize;
    public String type;
    public bicycle()
    {
        type="Road Bike";
        tyreRadius=24;
        frameSize="700c x 480 mm";
    }
    public bicycle(double r, String f, String t)
    {
        type=t;
        frameSize=f;
        tyreRadius=r;
    }
    public bicycle(String setter)
    {
        Scanner s=new Scanner(System.in);
        if (setter.equals("auto"))
        {
            System.out.println("Where do you want to ride? City, mountain, or road?");
            String place=s.nextLine();
            if (place.equals("city"))
                type="City Bike";
            else if (place.equals("mountain"))
                type="Mountain Bike";
            else if (place.equals("road"))
                type="Road Bike";
            else
                type="Hybird Bike";
            System.out.println("We provide you "+type+".");      
            System.out.println("What's your height in cm?");
            double height=s.nextDouble();
            if (height>=150&&height<=160)
                frameSize="650c x 420 mm";
            else if (height<=165)
                frameSize="700c x 440 mm";
            else if (height<=170)
                frameSize="700c x 460 mm";
            else if (height<=175)
                frameSize="700c x 480 mm";
            else if (height<=180)
                frameSize="700c x 490 mm";
            else 
                frameSize="700c x 520 mm";
            System.out.println("Your frame size is "+this.frameSize+".");   
            
            System.out.println("Do your want big tyre or small tyre?");
            String size=s.nextLine();
            if (size.equals("small"))
                tyreRadius=22;
            else if (size.equals("medium"))
                tyreRadius=24;
            else if (size.equals("large"))
                tyreRadius=26;
            else
                tyreRadius=24;
            System.out.println("Your tyre size is "+this.tyreRadius+"inches."); 
        }
        if (setter.equals("manual"))
        {
            System.out.println("What type of bicycle do you want?");
            type=s.nextLine();
            System.out.println("We provide you "+type+".");      
            
            System.out.println("What frame size do you want?");
            frameSize=s.nextLine();
            System.out.println("Your frame size is "+this.frameSize+".");   
            
            System.out.println("Choose size for your bicycle's tyre in inches.");
            tyreRadius=s.nextDouble();
            System.out.println("Your tyre size is "+this.tyreRadius+"inches."); 
        }
    }
}
