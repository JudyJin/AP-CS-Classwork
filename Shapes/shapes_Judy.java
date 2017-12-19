import java.util.*;
/**
 * To get the area and circum for a shape.
 *
 * @Arthor: Judy Jin
 * @Instructor: Daniel Gunn
 * @Date: Dec.12, 2017 
 */
public class shapes_Judy
{
    public static void runner()
    {
        Random rng=new Random();
        Circle x= new Circle(rng.nextInt());
        System.out.println("This circle's radius is: "+x.getRadius());
        System.out.println("This circle's area is: "+x.getArea());
        System.out.println("This circle's circumference is: "+x.getCircum());
        Circle c=new Circle(5);
        System.out.println("This circle's area is: "+c.getArea());
        System.out.println("This circle's circumference is: "+c.getCircum());
        
        Rectangle aa= new Rectangle(rng.nextInt(),rng.nextInt());        
        System.out.println("This rectangle's area is: "+aa.getArea());
        System.out.println("This rectangle's perimeter is: "+aa.getPerimeter());        
        Rectangle r=new Rectangle(5,4);
        System.out.println("This rectangle's area is: "+r.getArea());
        System.out.println("This rectangle's perimeter is: "+r.getPerimeter());
        
        Triangle tri=new Triangle(5,4);
        System.out.println("This triangle's area is: "+tri.getArea());
        System.out.println("This trianle's perimeter is: "+tri.getPerimeter());
        Triangle triangle=new Triangle(rng.nextInt(),rng.nextInt());        
        System.out.println("This triangle's area is: "+triangle.getArea());
        System.out.println("This triangle's perimeter is: "+triangle.getPerimeter());   
    }
}
