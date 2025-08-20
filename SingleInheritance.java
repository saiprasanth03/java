//implementation of single inheritance
class Animal
{
	String name;
	Animal(String name)
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
class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
	void bark()
	{
		System.out.println(name+" is barking");
	}
}
public class SingleInheritance
{
	public static void main(String[] args)
	{
		Dog d1= new Dog("Rocky");
		d1.bark();
		d1.eat();
		d1.run();
	}
}
