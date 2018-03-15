import java.util.*;
/**
 * This is a course system, containing lessons and assessments.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar. 15
 */
public class Course
{
    public String courseTitle;
    public int maxStu;
    public int numOfLesson;
    public Lesson [] courseLesson;
    public Assessment courseAssessment;
    public Course()
    {
        courseLesson =new Lesson[50];
        numOfLesson=0;
        courseAssessment= new Assessment();
    }
    public void addLesson(String title, int mins, boolean lab)
    {
        Lesson newLes= new Lesson(title, mins,lab);
        courseLesson[numOfLesson]=newLes;
        numOfLesson++;
    }
    public void addAssessment(String title, int mark)
    {
        courseAssessment = new Assessment(title,mark);
    }
    public void printDetails()
    {
        String printD = "";
        for (int i=0; i<numOfLesson; i++)
        {
            printD = printD + "Lesson "+(i+1)+"\n"+courseLesson[i].ToString()+"\n";
        }
        System.out.println("Course\n\nLesson Details: \n"+printD+"\nAssesment Details: \n"+courseAssessment);
    }
    public static void main()
    {
        Course alala=new Course();
        alala.addLesson("Judy Beautiful", 1000, true);
        alala.addLesson("Maggie Beautiful", 200, false);
        alala.addAssessment("Is Judy Beautiful?", 100);
        alala.printDetails();
    }
}
