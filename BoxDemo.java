//constructer overloading
class Box
{
	double length;
	double width;
	double height;
	public Box()
	{
		this.length=0.0;
		this.width=0.0;
		this.height=0.0;
	}
	public Box(double a,double b)
	{
		this.length=a;
		this.width=b;
	}
	public Box(double a,double b,double c)
	{
		this.length=a;
		this.width=b;
		this.height=c;
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b1=new Box();
		System.out.println(b1.length);
		System.out.println(b1.width);
		System.out.println(b1.height);
		Box b2=new Box(10,20);
		System.out.println(b2.length);
		System.out.println(b2.width);
		Box b3=new Box(30,20,10);
		System.out.println(b3.length);
		System.out.println(b3.width);
		System.out.println(b3.height);
	}
}
