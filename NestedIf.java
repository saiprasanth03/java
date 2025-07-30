import java.util.Scanner;
public class NestedIf
{
	public static void main(String args[])
	{
		Scanner value=new Scanner(System.in);
		System.out.println("NESTED IF  Loop");
		System.out.println("Enter a value  :  ");
		int num=value.nextInt();
		if(num<50)
		{
			System.out.println(num+"  is less then 50 ");
			if( num%10==0)
			{
				System.out.println(num+"  is divisible  by  10 ");
				if( num%5==0)
				{
					System.out.println(num+"  is divisible  by  5");
				}	
			}
		}
	}
}
