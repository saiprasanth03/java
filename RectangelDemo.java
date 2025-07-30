//rectangle properties
class Rectangle
{
	double length;
	double width;
	public Rectangle()
	{
		this.length=0.0;
		this.width=0.0;
	}
	public Rectangle(double l,double w)
	{
		this.length=l;
		this.width=w;
	}
	public void getArea(double length,double width)
	{
		System.out.println("Area = "+length*width);
	} 
	public void getPerimeter(double length,double width)
	{
		System.out.println("Perimeter = "+2*(length+width));
	}
}
public class RectangelDemo
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle(10,20);
		r1.getArea(10,20);
		r1.getPerimeter(10,20);
	}
}
