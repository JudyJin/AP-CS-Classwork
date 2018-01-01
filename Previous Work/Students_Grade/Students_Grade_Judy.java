import java.util.*;
/**
 * This program is aimed at calculating the average grade of each student.
 *
 * @Author: Judy Jin 
 * @Instructor: Daniel Gunn
 * @Version: 1.0
 * @Date: Sep. 28, 2017
 */
public class Students_Grade_Judy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Number of students in your class: ");
        int number=in.nextInt();
        System.out.print("Number of assignments: ");
        int ass=in.nextInt();
        double sum=0;
        double average;
        
        for (int s=1; s<=number; s++)
        {
            System.out.println("\nStudent "+s+":");
            for (int a=1; a<=ass; a++)
            {
                System.out.print("Score of Assignment "+a+": ");
                double score=in.nextDouble();
                sum+=score;
            }
            average=(sum)/ass;
            System.out.println("The average socore is: "+ average);
            
        }
    }
}
