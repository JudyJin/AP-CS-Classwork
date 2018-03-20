import java.util.*;
/**
 * This is the runner for mergeable integer set.
 *
 * @Judy
 * @Mar.20
 */
public class IntegerSet implements Mergeable
{
    public int set[];
    public int size;
    public IntegerSet(int[]a)
    {
        set=new int [a.length];
        for (int i=0;i<a.length;i++)
            set[i]=a[i];
        this.size=set.length;
    }
    public IntegerSet merge(IntegerSet a)
    {
        int merge[]=new int[this.size+a.size];
        for (int i=0;i<this.size;i++)
            merge[i]=this.set[i];
        for (int i=this.size;i<merge.length;i++)
            merge[i]=a.set[i-this.size];
        IntegerSet after=new IntegerSet (merge);
        return after;
    }
    public void printElements()
    {
          System.out.println(printArray(this.set));
    }
    public int getSize()
    {
        return this.size;
    }
    public boolean elementOf(int b)
    {
        for (int i=0;i<this.set.length;i++)
            return this.set[i]==b;
        return false;
    }
    public static String printArray(int[]a)
    {
        String st="";
        for (int i=0; i<a.length; i++)
            st=st+(a[i]+" ");
        return st;
    }
}
