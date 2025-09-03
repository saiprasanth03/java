//Super Method
class Parent
{
	Parent()
	{
		System.out.println("Parent constructor is called");
	}
	void display()
	{
		System.out.println("Parent method is called");
	} 
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Child constructor is called");
	}
	void show()
	{
		super.display();
		System.out.println("Child method is called");
	}
}
public class SuperMethod
{
	public static void main(String[] args)
	{
		Child d= new Child();
		d.show();
	}
}
