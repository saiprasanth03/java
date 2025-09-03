//ArrayList Searching
import java.util.ArrayList;
public class ArrayDemo3
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Raghu");
		names.add("Gopal");
		names.add("Varma");
		names.add("Mahesh");
		names.add("Prasanth");
		String searchname = "Prasanth";
		 if(names.contains(searchname))
		 {
		 	System.out.println(searchname+" is present in arraylist");
		 }
		 else
		 {
		 	System.out.println(searchname+" is not present in arraylist");
		 }
	}
}
