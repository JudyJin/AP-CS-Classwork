
/**
 * This provides the assessment for course.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar. 15
 */
public class Assessment
{
    public String assTitle;
    public int maxMark;
    public Assessment()
    {
        assTitle="";
        maxMark=100;
    }
    public Assessment(String title, int mark)
    {
        this.assTitle=title;
        this.maxMark=mark;
    }
    public String toString ()
    {
        return "Assessment Title: "+this.assTitle+"\nMaxium Mark: "+this.maxMark;
    }
        public void printDetails()
    {
        System.out.println("Assessment Title: "+this.assTitle+"\nMaxium Mark: "+this.maxMark);
    }
}
