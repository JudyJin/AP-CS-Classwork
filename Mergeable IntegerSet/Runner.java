
/**
 * This is the runner for mergeable integer set.
 *
 * @Judy
 * @Mar.20
 */
public class Runner
{
    public static void main()
    {
        int[] set={3,4,6,2,6,0};
        int[] set2={3,2,5,3,2,77,3,1};
        
        IntegerSet a=new IntegerSet(set);
        IntegerSet b=new IntegerSet(set2);
    
        System.out.println("");
        System.out.println(a.getSize());
        
        a.printElements();
        b.printElements();
        
        System.out.println(a.elementOf(5));
        System.out.println(a.elementOf(3));
        
        IntegerSet c=a.merge(b);
        c.printElements();
    }
}
