import java.util.*;
/**
 * This provides individual lesson for course.
 *
 * @Author: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar. 15
 */
public class Lesson
{
    public String lesTitle;
    public int durMins;
    public boolean requireLab;
    public Lesson()
    {
        lesTitle="";
        durMins=120;
        requireLab=false;
    }
    public Lesson(String title, int mins, boolean lab)
    {
        lesTitle=title;
        durMins=mins;
        requireLab=lab;
    }
    public String ToString()
    {
        return "Lesson Title: "+lesTitle+"\nDuration Minutes: "+durMins+"\nRequires Lab: "+requireLab;
    }
    public void printDetails()
    {
        System.out.println("Lesson Title: "+lesTitle+"\nDuration Minutes: "+durMins+"\nRequires Lab: "+requireLab);
    }
}
