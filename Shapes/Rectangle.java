
/**
 * This is the Rectangle class for shapes
 *
 * @Judy 
 * @Dec.12 
 */
public class Rectangle extends shapes_Judy
{
    private double length;
    private double width;
    private double area;
    private double peri;
    public Rectangle(double length,double width)
    {
        this.length=Math.abs(length);
        this.width=Math.abs(width);
    }
    public double getArea()
    {
        this.area=this.length*this.width;
        return this.area;
    }
    public double getPerimeter()
    {
        this.peri=this.length*2+this.width*2;
        return this.peri;
    }
}
