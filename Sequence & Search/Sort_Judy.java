import java.util.*;
/**
 * This program is aimed at sorting the array, using selection sort and inserting sort.
 *
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Nov.15, 2017
 */
public class Sort_Judy
{
    public static void main()
    {
        int array[]= {5,3,7,6,8,10,4,15,20,13,12};
        System.out.println("Selection sort: "+Arrays.toString(selectionSort(array)));
        System.out.println("Insertion sort: "+Arrays.toString(insertSort(array)));
        System.out.println("Merge     sort: "+Arrays.toString(mergeSort(array)));
        System.out.println("Merge_____sort: "+Arrays.toString(mergeSort2(array)));
    }
    /**
     * @Selection sort
     *  
     * @param arr an unsorted one dimensional array
     */
    public static int[] selectionSort(int []arr)
    {
        int small;
        int t;
        for (int i=0;i<arr.length-1;i++)
        {
            small=arr[i];
            t=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<small)
                {
                    small=arr[j];
                    t=j;
                }
            }
            arr[t]=arr[i];
            arr[i]=small;
        }
        return arr;
    }
    /**
     * @Insertion sort
     * 
     * @param arr an unsorted one dimensional array
     */
    public static int[] insertSort(int []arr)
    {
        int temp;
        int t;
        for (int i=0;i<arr.length;i++)
        {
            t=i;
            temp=arr[i];
            while(t>0&&arr[i]<arr[t])
            {
                arr[i]=arr[t];
                arr[t]=temp;
                t--;
            }
        }
        return arr;
    }
    /**
     * @Merge sort
     * 
     * @param a an unsorted one dimensional array
     */
        public static int[] mergeSort(int []a)
    {
        if(a.length<2)
            return a;
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
        //recursion
        mergeSort(head);
        mergeSort(tail);
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
        return a;
    }
    /**
     * @Merge sort using the original array and a working array.
     * 
     * @param a an unsorted one dimensional array
     */
    public static int[] mergeSort2(int []a)
    {
        int []b=Arrays.copyOf(a,a.length);
        return TDSMerge(b,0,a.length,a);
    }
    public static int[] TDSMerge(int b[],int iBegin, int iEnd, int a[])
    {
        if(iEnd-iBegin<2)
            return b;
        int iMiddle=(iEnd+iBegin)/2;
        TDSMerge(a,iBegin,iMiddle,b);
        TDSMerge(a,iMiddle,iEnd,b);
        TDMerge(b,iBegin,iMiddle,iEnd,a);
        return b;
    }
    public static int[] TDMerge(int b[],int iBegin, int iMiddle,int iEnd, int a[])
    {
        int i=iBegin;
        int j=iMiddle;
        for (int k=iBegin;k<iEnd;k++)
        {
            if(i<iMiddle&&(j>=iEnd||a[i]<=a[j]))
            {
                b[k]=a[i];
                i++;
            }
            else
            {
                b[k]=a[j];
                j++;
            }
        }
        return b;
    }
}