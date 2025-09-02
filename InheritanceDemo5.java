// Inheritance of constructors
class A
{
	A()
	{
		System.out.println("Constructor of A called");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Constructor of B called");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Constructor of C called");
	}
}
class D extends C
{
	D()
	{
		System.out.println("Constructor of D called");
	}
}
public class InheritanceDemo5
{
	public static void main(String[] args)
	{		
		D d = new D();
	}
}
