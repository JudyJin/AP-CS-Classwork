
/**
 * This is the Triangle class for shapes
 *
 * @Judy 
 * @Dec.12 
 */
public class Triangle extends shapes_Judy
{
    private double length;
    private double height;
    private double area;
    private double peri;
    public Triangle(double length,double height)
    {
        this.length=Math.abs(length);
        this.height=Math.abs(height);
    }
    public double getArea()
    {
        this.area=this.length*this.height*1/2;
        return this.area;
    }
    public double getPerimeter()
    {
        this.peri=Math.pow((this.length*1/2*this.length*1/2+this.height*this.height),1/2)*2+this.length;
        return this.peri;
    }
}