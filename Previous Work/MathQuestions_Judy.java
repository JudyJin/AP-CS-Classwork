import java.util.*;
/**
 * This program is aimed at solving the following math problems.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Sep.21, 2017
 */
public class MathQuestions_Judy
{
    public static void main1()
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Q1: x^2+5x-7=?");
        System.out.print("x=");
        double x1=input.nextDouble();
        double ans1=Math.pow(x1,2)+(5*x1)-7;
        System.out.println("x^2+5x-7="+ans1);
        System.out.println(" ");
    }
        public static void main2()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Q2: 10x^3+5x^2-x+10=?");
        System.out.print("x=");
        double x2=input.nextDouble();
        double ans2=10*Math.pow(x2,3)+5*Math.pow(x2,2)-(x2)+100;
        System.out.println("10x^3+5x^2-x+10="+ans2);
        System.out.println(" ");
        
        System.out.println("Q3: ^5√x+2√x=?");
        System.out.print("x=");
        double x3=input.nextDouble();
        double ans3=Math.pow(x3,0.2)+2*Math.sqrt(x3);
        System.out.println("^5√x+2√x="+ans3);
        System.out.println(" ");
        
        System.out.println("Q4: The distance between 2 points A(x1,y1) and B(x2,y2)?");
        System.out.print("x1=");
        double x4=input.nextDouble();
        System.out.print("y1=");
        double y1=input.nextDouble();
        System.out.print("x2=");
        double x5=input.nextDouble();
        System.out.print("y2=");
        double y2=input.nextDouble();
        double ans4=Math.sqrt(Math.pow(x5-x4,2)+Math.pow(y2-y1,2));
        System.out.println("The distance is "+ans4);
        System.out.println(" ");
        
        System.out.println("Q5: The hypotenuse C for two sides A and B is?");
        System.out.print("A=");
        double A=input.nextDouble();
        System.out.print("B=");
        double B=input.nextDouble();
        double ans5=Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
        System.out.println("C="+ans5);
        System.out.println(" ");
        
        System.out.println("Q6: (x^2+y^2)/(7x)=?");
        System.out.print("x=");
        double x6=input.nextDouble();
        System.out.print("y=");
        double y3=input.nextDouble();
        double ans6=(Math.pow(x6,2)+Math.pow(y3,2))/(7*x6);
        System.out.println("(x^2+y^2)/(7x)="+ans6);
        System.out.println(" ");
        
        System.out.println("Q7: √((x^2+3x^3)/(2xy))=?");
        System.out.print("x=");
        double x7=input.nextDouble();
        System.out.print("y=");
        double y4=input.nextDouble();
        double ans7=Math.sqrt(((Math.pow(x7,2)+3*Math.pow(x7,3))/(2*x7*y4)));
        System.out.println("√((x^2+3x^3)/(2xy))="+ans7);
        System.out.println(" ");
        
        System.out.println("Q8: 2x+√(x/2)=?");
        System.out.print("x=");
        double x8=input.nextDouble();
        double ans8=2*x8+Math.sqrt((x8/2));
        System.out.println("2x+√(x/2)="+ans8);
        System.out.println(" ");
    }
}
