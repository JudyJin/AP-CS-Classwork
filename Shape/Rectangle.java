
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
        this.length=Math.abs(length);
        this.width=Math.abs(width);
    }
    public double area()
    {
        this.area=length*width;
        return this.area;
    }
    public double perimeter()
    {
        this.peri=length*2+width*2;
        return this.peri;
    }
}
