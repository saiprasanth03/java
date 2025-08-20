//Array methods
import java.util.Arrays;
public class Array1
{
	public static void main(String[] args)
	{
		//toString method
		int[] a={1,8,4,2,9,6};
		System.out.println("Using toString");
		System.out.println(a);
		System.out.println(Arrays.toString(a)+"\n");
		
		//sort method
		Arrays.sort(a);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a)+"\n");
		
		//binarySearch method
		int index=Arrays.binarySearch(a,3);
		System.out.println("Binary search");
		if(index>=0)
		{
			System.out.println("Found at index "+index+"\n");
		}
		else
		{
			System.out.println("Element Not Found"+"\n");
		}
		
		//fill method
		int[] b=new int[6];
		Arrays.fill(b,4);
		System.out.println("Fill method");
		System.out.println(Arrays.toString(b)+"\n");
		
		//Equal method
		boolean check = Arrays.equals(a,b);
		System.out.println(check);
		
		//copyOf method
		int[] newArray=Arrays.copyOf(a,8);
		System.out.println("\n"+Arrays.toString(newArray)+"\n");
		
		//Accessing elements
		System.out.println("Accessing elements");
		System.out.println(a[3]+"\n");
		
		//Modifying Elements
		System.out.println("Modifying Elements");
		a[3]=7;
		System.out.println(a[3]+"\n");
		
		//Iterating through Arrays
		System.out.println("Accessing Elements through for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n"+"Accessing Elements through forEach loop");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		//Copying Elements
		System.out.println("\n"+"Copying Elements for loop");
		int[] c= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		System.out.println("Copied array"+Arrays.toString(c)+"\n");
	}
}


















