
/**
 * This is the Rectangle class for shapes
 *
 * @Judy 
 * @Mar.13
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    private double area;
    private double peri;
    public Rectangle(double length,double width, String recName)
    {
        super(recName);
        length=Math.abs(length);
        width=Math.abs(width);
    }
    public double area()
    {
        area=length*width;
        return area;
    }
    public double perimeter()
    {
        peri=length*2+width*2;
        return peri;
    }
}
