//invoking class and method in main class
class Person
{
	int age;
	String name;
	void setDetails(int a,String b)
	{
		age=a;
		name=b;
	}
	void getDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
public class PersonDemo
{
	public static void main(String args[])
	{
		Person p1=new Person();
		p1.setDetails(18,"Prasanth");
		p1.getDetails();
	}
}
