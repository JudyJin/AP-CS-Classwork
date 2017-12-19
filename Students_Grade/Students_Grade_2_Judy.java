import java.util.*;
/**
 * This program is aimed at calculating the average grade of each student.
 *
 * @Author: Judy Jin 
 * @Instructor: Daniel Gunn
 * @Version: 2.0
 * @Date: Sep. 28, 2017
 */
public class Students_Grade_2_Judy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Number of students in your class: ");
        int number=in.nextInt();
        double sum=0;
        double average=0;
        int a=0;
        
        for (int s=1; s<=number; s++)
        {
            System.out.println("\nStudent "+s+":");
            while(true)
            {
                System.out.print("Score of Assignment "+(a+1)+": ");
                double score=in.nextDouble();
                if(score>=0 && score<=100)
                    sum+=score;
                else if(score==-1)
                    break;
                else
                {
                    System.out.println("Invalid Input");
                    a--;
                }
                a++;
                average=sum/a;
            }
            System.out.println("The average socore is: "+ average);
            average=0; sum=0; a=0;
        }
    }
}
