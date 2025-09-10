//Area for different shapes
abstract class Shape
{
	abstract void area();
	void show()
	{
		System.out.println("Concreate method is called");
	}
} 
class Square extends Shape
{
	double length;
	Square(double length)
	{	
		this.length=length;
	}
	void area()
	{
		System.out.println("Area of square is "+length*length);
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle(double length,double width)
	{	
		this.length=length;
		this.width=width;
	}
	void area()
	{
		System.out.println("Area of Rectangle is "+length*width);
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("Area of Circle is "+(3.14*radius*radius));
	}
}
public class AbstractArea
{
	public static void main(String[] args)
	{
		
		Shape s1=new Square(5);
		s1.area();
		s1.show();
		Shape s2=new Rectangle(5,2);
		s2.area();
		Shape s3=new Circle(5);
		s3.area();

	}
}
