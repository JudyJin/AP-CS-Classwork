
/**
 * This is the circle class for shapes
 *
 * @Judy
 * @Dec.12
 */
public class Circle extends shapes_Judy
{
    private double radius;
    private double area;
    private double circum;
    private static final double PI=Math.PI;//class variable;
    public Circle()
    {
        this.radius=1;
    }
    public Circle(double radius)
    {
        this.radius=Math.abs(radius);
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        this.area=PI*this.radius*this.radius;
        return this.area;
    }
    public double getCircum()
    {
        this.circum=PI*this.radius*2;
        return this.circum;
    }
}
