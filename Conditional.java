import java.util.Scanner;
public class Conditional
{
	public static void main(String args[])
	{
		Scanner  value=new Scanner(System.in);
		int a;
		System.out.println("Enter  a value  :  ");
		a=value.nextInt();
		System.out.println("IF  Statement");
		if(a<10)
		{
			System.out.println("value of a is " + a);
		}
		
		System.out.println("\nIF  ELSE  Statement");
		if(a%2==0)
		{
			System.out.println(a+ "  is  even number");
		}
		else
		{
			System.out.println(a+ "  is  odd number");
		}
		
		System.out.println("\nELSE  IF Ladder");
		System.out.println("Enter your  marks  :  ");
		int marks=value.nextInt();
		if(marks>=90)
		{
			System.out.println("A grade");
		}
		else if(marks>=80)
		{
			System.out.println("B grade");
		}
		else if(marks>=70)
		{
			System.out.println("C grade");
		}
		else if(marks>=60)
		{
			System.out.println("D grade");
		}
		else if(marks>=50)
		{
			System.out.println("E grade");
		}
		else if(marks>=40)
		{
			System.out.println("F grade");
		}
		
		System.out.println("\nSWITCH case");
		System.out.println("\nEnter a Number (1 to 7)  :   ");
		int week=value.nextInt();
		switch(week)
		{
			case 1: 
				System.out.println("\nSUNDAY") ;
				break;
			case 2: 
				System.out.println("\nMONDAY") ;
				break;
			case 3: 
				System.out.println("\nTUESDAY") ;
				break;
			case 4: 
				System.out.println("\nWEDNESDAY") ;
				break;
			case 5: 
				System.out.println("\nTHURSDAY") ;
				break;
			case 6: 
				System.out.println("\nFRIDAY") ;
				break;
			case 7: 
				System.out.println("\nSATURDAY") ;
				break;	
				
		}
	}
}
