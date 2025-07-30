import java.util.Scanner;
public class DoWhile
{
	public static void main(String args[])
	{
		Scanner value=new Scanner(System.in);
		System.out.println("DO WHILE loop\n");
		System.out.println("Enter  a  value   :  ");
		int a=value.nextInt();
		do
		{
			System.out.println(a);
			a++;
		}while(a<10);
	}
}
