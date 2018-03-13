
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
        this.length=Math.abs(length);
        this.height=Math.abs(height);
    }
    public double area()
    {
        this.area=length*height*1/2;
        return this.area;
    }
    public double perimeter()
    {
        this.peri=Math.pow((length*1/2*length*1/2+height*height),1/2)*2+length;
        return this.peri;
    }
}