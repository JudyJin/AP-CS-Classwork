
/**
 * This is the solusions for logic2 codingbat
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Dec.19, 2017 
 */
public class Logic2
{
    public static boolean makeBricks(int small, int big, int goal) {
        return (!(big*5+small<goal||small<goal%5));
    }
    public static int loneSum(int a, int b, int c) {
        if (a==b&&b==c)
            return 0;
        if (a==b)
            return c;
        if (a==c)
            return b;
        if (b==c)
            return a;
        return a+b+c;
    }
    public static int luckySum(int a, int b, int c) {
        if (a==13)
            return 0;
        if (b==13)
            return a;
        if (c==13)
            return a+b;
        return a+b+c;
    }
}
