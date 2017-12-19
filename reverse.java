
/**
 * This program is aimed at reversing the .
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverse
{
    public static void main()
    {
       System.out.println(revStr("Hello"));
       System.out.println(revStr2("Hello"));
       System.out.println(rev(13725,5));
    }
    public static String revStr(String str)
    {
        if (str.length()==1)
            return str;
        return str.substring(str.length()-1)+revStr(str.substring(0,str.length()-1));
    }
    public static String revStr2(String str)
    {
        if (str.length()==1)
            return str;
        String tail=str.substring(1);
        return revStr2(tail)+str.substring(0,1);
    }
    
    public static int rev(int a, int b)
    {
        if (a<10)
            return a;
        
        int n=a%10;
        int m = a/10;
        int o = rev(m, b-1);
        return (int)(n*Math.pow(10,b-1))+o;
    }
}
