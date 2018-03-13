
/**
 * This is the Triangle class for shapes
 *
 * @Judy 
 * @Mar.13 
 */
public class Triangle extends Shape
{
    private double length;
    private double height;
    private double area;
    private double peri;
    public Triangle(double length,double height, String triName)
    {
        super(triName);
        length=Math.abs(length);
        height=Math.abs(height);
    }
    public double area()
    {
        area=length*height*1/2;
        return area;
    }
    public double perimeter()
    {
        peri=Math.pow((length*1/2*length*1/2+height*height),1/2)*2+length;
        return peri;
    }
}