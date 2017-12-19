import java.util.*;
/**
 * Teaching material related to ARRAY
 *
 * @Judy Jin 
 * @Oct. 18, 2017
 */
public class Array
{
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        //int size=input.nextInt();
        //int [] myArray= new int [size];
        //myArray[2]=22;
        //System.out.println(myArray[2]);
        //double youArray[]=new double[4];
     
        //Primitive
        //type[]nmae;          declearation 
        //name=new type[size]; initialization
        //Aready assigned all the numbers to 0
     
        int[]number=new int[10];
        for(int i=0;i<number.length;i++)
        { System.out.print("Number "+(i+1)+": ");
          number[i]=input.nextInt();}
        
        
        for(int i=number.length-1;i>0;i--)
         System.out.print(number[i]+" ");
    }
}
