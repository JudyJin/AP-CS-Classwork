import java.util.*;
/**
 * To get the area and perimeter for a shape.
 *
 * @Arthor: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Mar.13, 2018 
 */
public abstract class Shape
{
    private String name;
    public double radius;
    public Shape(String shapeName) 
    {
        name = shapeName; 
    }
    public String getName() 
    { 
        return name; 
    }
    public double getRadius()
    {
        return radius;
    }
    public abstract double area(); 
    public abstract double perimeter();
    public double semiPerimeter()
    {
        return perimeter() / 2; 
    } 
    public static void runner()
    {
        Random rng=new Random();
        Shape x= new Circle(rng.nextInt(),"Judy's Circle");
        System.out.println("This circle's name is: "+x.getName());
        System.out.println("This circle's area is: "+x.area());
        System.out.println("This circle's circumference is: "+x.perimeter());
        
        System.out.print("Test .equals:");
        Circle TEST1= new Circle(5,"Circle 1");
        Circle TEST2= new Circle(5,"Circle 2");
        System.out.println (TEST1.equals(TEST2));
        
        
       
        Shape aa= new Rectangle(rng.nextInt(),rng.nextInt(), "Judy's Square");        
        System.out.println("This rectangle's area is: "+aa.area());
        System.out.println("This rectangle's perimeter is: "+aa.perimeter());  
        System.out.println("This rectangle's semi-perimeter is: "+aa.semiPerimeter());  
       
        Shape tri=new Triangle(5,4,"Judy's triangle");
        System.out.println("This triangle's area is: "+tri.area());
        System.out.println("This trianle's perimeter is: "+tri.perimeter());
        
        Shape triangle=new Triangle(rng.nextInt(),rng.nextInt(),"TRIANGLE!!"); 
        System.out.println("Name: "+triangle.getName());
        System.out.println("This triangle's area is: "+triangle.area());
        System.out.println("This triangle's perimeter is: "+triangle.perimeter()); 
         
    }
}
