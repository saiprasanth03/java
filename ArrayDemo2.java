//Basic ArrayList 
import java.util.ArrayList;
public class ArrayDemo2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> number = new ArrayList<>();
		
		for(int i=1;i<=6;i++)
		{
			number.add(i);
		}
		System.out.println("Using ForEach loop");
		for(int num:number)
		{
			System.out.println(num);
		}
		System.out.println("Using For loop");
		for(int i=0;i<6;i++)
		{
			System.out.println(number.get(i));
		}
	}
}
