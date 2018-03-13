
/**
 * This is the circle class for shapes
 *
 * @Judy
 * @Mar.13
 */
public class Circle extends Shape
{
    private double radius;
    private double area;
    private double circum;
    private static final double PI=Math.PI;//class variable;
    public Circle(double circleRadius, String circleName) 
    {
        super(circleName);
        this.radius = Math.abs(circleRadius); 
    }
    public double getRadius()
    {
        return radius;
    }
    public boolean equals(Circle obj){
        return (this.radius==obj.radius);
    }
    public double area()
    {
        area=PI*radius*radius;
        return area;
    }
    public double perimeter()
    {
        circum=PI*radius*2;
        return circum;
    }
}
