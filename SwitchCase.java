import java.util.Scanner;
public class SwitchCase
{
	public static void main(String args[])
	{
		Scanner  value=new Scanner(System.in);
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
