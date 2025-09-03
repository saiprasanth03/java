//Arraylist of objects
import java.util.ArrayList;
class Student
{
	int id;
	String name;
	Student(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	public String toString()
	{
		return id+ "-" + name;
	}
}
public class ArrayDemo4
{
	public static void main(String[] args)
	{
		ArrayList<Student> students  = new ArrayList<>();
		students.add(new Student(1,"Raghu"));
		students.add(new Student(2,"Tarun"));
		students.add(new Student(3,"Abhiram"));
		students.add(new Student(4,"Ram"));
		students.add(new Student(5,"Varma"));
		for(Student s : students)
		{
			System.out.println(s);
		}
	}		
}
