import java.util.*;

/**
 * This is the examiner for testing the suitability to be Judy's Husband.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Sep.22, 2017
 */
public class Are_You_My_MrRight
{
   public static void main()
   {
       Scanner input=new Scanner(System.in);
       
       System.out.println("Hello, come and test the suitability to be Judy's Husband.");
       System.out.print(" \nEnter your name: ");
       String name=input.nextLine();
       System.out.println("\n"+name+", Can You Be Judy'S Mr. Right?");
       
       System.out.println(" \nWhat's your gender?");
       String gender=input.nextLine();
       if (gender.compareToIgnoreCase("M")==0||gender.compareToIgnoreCase("Male")==0)
       {
           System.out.println(" \nWhat's your sexual orientation?");
           String SO=input.nextLine();
           if (SO.compareToIgnoreCase("F")==0||SO.compareToIgnoreCase("Female")==0||SO.compareToIgnoreCase("girl")==0)
           {
               System.out.println(" \nWhat's your height in cm?");
               double height=input.nextDouble();
               if (height>=180)
               {
                   System.out.println(" \nWhat's your weight in kg?");
                   double weight=input.nextDouble();
                   double BMI=weight/Math.pow(height/100,2);
                   if (BMI>24)
                        System.out.println(" \nSorry, "+ name+ ", you are too fat.\nYou cannot be Judy's husband.");
                   else if (BMI<17)
                        System.out.println(" \nSorry, "+ name+ ", you are too thin.\nYou cannot be Judy's husband.");
                   else
                   {
                        System.out.println(" \nWhat's your IQ?");
                        int IQ=input.nextInt();
                        if (IQ<90)
                            System.out.println(" \nSorry, "+ name+ ", Judy doesn't like person whoes IQ is lower than 90.\nYou cannot be Judy's husband.");
                        else
                        {
                            System.out.println(" \nNumber of your ex-girlfriend(s)?");
                            int number=input.nextInt();
                            if (number>5)
                                System.out.println(" \nSorry, "+ name+ ".\nYou cannot be Judy's husband.");
                            else
                            {
                                System.out.println(" \nDo you like sports, "+name+"?");
                                Scanner in=new Scanner(System.in);
                                String sports=in.nextLine();
                                if (sports.compareToIgnoreCase("Yes")==0)
                                {
                                    System.out.println(" \nDo you love Judy?");
                                    String Judy=in.nextLine();
                                    if (Judy.compareToIgnoreCase("Yes")==0||Judy.compareToIgnoreCase("like")==0)
                                        System.out.println(" \nWoo, "+ name+ ", nice to meet you.\nYou can be Judy's husband.");
                                    else 
                                        System.out.println(" \n"+ name+ ". You are done.\n??? Why doing this test since you don't love Judy.\nYou cannot be Judy's husband.");
                                }
                                else
                                    System.out.println(" \nSorry, "+ name+ ", you are done.\nYou cannot be Judy's husband.");
                            }
                        }
                   }
               }
               else
                    System.out.println(" \nSorry, "+ name+ ", you are too short.\nYou cannot be Judy's husband.");
           }
           else
                System.out.println(" \nSorry, "+ name+ ", you are done.\nYou cannot be Judy's husband.");
       }
       else 
            System.out.println(" \nSorry, "+ name+ ", you are done.\nYou cannot be Judy's husband.");
    }    
   }

