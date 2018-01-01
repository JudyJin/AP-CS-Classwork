
/**
 * This program is aimed at simulating the probability of passengers's showing up.
 *
 * @Author: Judy Jin 
 * @Version: 1.0 
 * @Date: Nov.6, 2017
 */
public class flightSimulation
{
    public static void main()
    {
        for (int n=1;n<11;n++)
        {
            int count=0;
            for (int i=0;i<45;i++)
            {
                int num=(int)(10*Math.random());
                if(num!=9)
                count++;
                System.out.print(num+" ");
            }
            System.out.println("Trial "+n+": "+count+" passengers show up.");
        }
    }
}
