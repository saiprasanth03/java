//Hierarchiral inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class Puppy extends Animal
{
	void weep()
	{	
		System.out.println("Weeping...");
	}
}
public class InheritanceDemo3

{
	public static void main(String[] args)
	{
		Puppy p = new Puppy();
		p.eat();
		p.weep();
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
