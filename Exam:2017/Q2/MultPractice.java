
/**
 * MultPractice 
 *
 * Author: Judy Jin
 * Instructor: Daniel Gunn
 * Date: Apr.25, 2018
 */
public class MultPractice implements StudyPractice
{
    int first;
    int second;
    public MultPractice(int a,int b)
    {
       first=a;
       second=b;
    }
    public String getProblem()
    {
        return (first+" TIMES "+second);
    }
    public void nextProblem()
    {
        this.second++;
    }
}
