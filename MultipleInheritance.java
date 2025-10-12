//implementation of hierarchical inheritance
class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
	public void eat()
	{
		System.out.println(name+" is eating");
	}
	public void run()
	{
		System.out.println(name+" is running");
	}
}
class Teacher extends Person
{
	public Teacher(String name)
	{
		super(name);
	}
	void teach()
	{
		System.out.println(name+" can teach");
	}
}
class Student extends Person
{
	public Student(String name)
	{
		super(name);
	}
	void practice()
	{
		System.out.println(name+" have to practice");
	}
}
public class MultipleInheritance
{
	public static void main(String[] args)
	{
		Teacher t1= new Teacher("Raghu");
		t1.teach();
		t1.eat();
		t1.run();
		Student s1 = new Student("Prasanth");
		s1.practice();
		s1.eat();
		s1.run();
	}
}
