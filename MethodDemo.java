//method overloading
class Calculate
{
	double a=0,b=0,x=0,y=0;
	public void add()
	{
		System.out.println("Addition = "+(a+b+x+y));
	}
	public void add(double a,double b)
	{
		System.out.println("Addition = "+(a+b));
	}
	public void add(double a,double b,double x)
	{
		System.out.println("Addition = "+(a+b+x));
	}
	public void add(double a,double b,double x,double y)
	{
		System.out.println("Addition = "+(a+b+x+y));
	}
}
public class MethodDemo
{
	public static void main(String args[])
	{
		Calculate c1 = new Calculate();
		c1.add();
		Calculate c2 = new Calculate();
		c2.add(1,2);
		Calculate c3 = new Calculate();
		c3.add(10,20,30); 
		Calculate c4 = new Calculate();
		c4.add(10,20,30,40);
	}
}
