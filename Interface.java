//Interface
interface Vehicle
{
	void start();
	void stop();
}
interface Electric
{
	void charge();
}
class Car implements Vehicle,Electric
{
	
	public void start()
	{
		System.out.println("Vehicle start");
	}
	public void stop()
	{
		System.out.println("Vehicle stop");
	}
	public void charge()
	{
		System.out.println("Vehicle charging..");
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Car c1 = new Car();
		c1.start();
		c1.charge();  
		c1.stop();
	}
}
