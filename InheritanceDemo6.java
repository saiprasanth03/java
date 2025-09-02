//using of super keyword
class Parent
{
	int val=100;
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
	int val=200;
	Child()
	{	
		super();
		System.out.println("Child constructor is called");
	}
	void show()
	{
		System.out.println("Child method is called");
		System.out.println("Child number is "+val);
		System.out.println("Parent number using super "+super.val);
		super.display();
	} 
}
public class InheritanceDemo6
{
	public static void main(String[] args)
	{	
		Child c = new Child();
		c.show();
	}
}
