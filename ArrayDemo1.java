//Basic ArrayList
import java.util.ArrayList;
public class ArrayDemo1
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Pineapple");
		System.out.println("Fruits are "+fruits);
		System.out.println("First Fruit "+fruits.get(0));
		fruits.remove("Guava");
		System.out.println("Fruits after removing "+fruits);
	}
}
