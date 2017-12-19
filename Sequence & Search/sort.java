import java.util.*;
/**
 * This program is aimed at sorting the array using binary search.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Version: 1.0 
 */
public class sort
{
    public static void main()
    {
        int [] Array={6,5,4,3,2,1};
        
        mergesort(Array);
        printArray(Array);
    }
    public static void main2()
    {
        int [] array = {6,5,4,3,2,1};
        mergesort(array);
        printArray(array);
    }
    public static void printArray(int[]a)
    {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void mergesort(int []a)
    {
        if(a.length<2)
            return;
       
        //split the array
        int[]head=new int[a.length/2];
        int[]tail=new int[(a.length+1)/2];
        int hi=0;
        int ti=0;
        for(int i=0;i<a.length;i++)
            if(i<a.length/2)
                head[hi++]=a[i];
            else
                tail[ti++]=a[i];
        printArray(head);
        printArray(tail);
        //recursion
        mergesort(head);
        mergesort(tail);
        //merge
        hi=0;
        ti=0;
        for (int i=0;i<a.length;i++)
        {
            if(hi==head.length)
                a[i]=tail[ti++];
            else if(ti==tail.length)
                a[i]=head[hi++];
            else if (head[hi]<tail[ti])
                a[i]=head[hi++];
            else
                a[i]=tail[ti++];
        }
        printArray(a);
    }
    public static void mergeSort(int[] array)
    {
        int num = array.length/2;
        int [] front = new int [num];
        int [] tail = new int [array.length - num];
        int [] a = new int[array.length];
        if(front.length >= 1 || tail.length >= 1)
            return;
            
            for (int i=0; i<num; i++)
            {
                front [i] = array [i];
            }
            for (int i=0; i<num; i++)
            {
                tail [i] = array [i+num];
            }
            
            mergeSort(front);
            mergeSort(tail);
            
            int n = 0;
            int i = 0;
            int j = 0;
            while (n < array.length && i < front.length && j < tail.length)
            {
                
                        if (front[i]<tail[j])
                        {
                            a[n] = front [i];
                            i++;
                        }
                        else
                        {
                            a[n] = tail [j];
                            j++;
                        }
                n ++;
            }
            System.out.println(n);
            System.out.println(i);
            System.out.println(j);
            if (i < front.length)
            {
                while (n < array.length)
                {
                    a[n] = front [i];
                    n ++;
                    i ++;
                }
            }
            else if (j < tail.length)
            {
                while (n < array.length)
                {
                    a[n] = front [j];
                    n ++;
                    j ++;
                }
            }
            else
        array = a;
        
        
        
    }
}
