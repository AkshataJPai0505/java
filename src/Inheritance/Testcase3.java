package Inheritance;
class vehicle
{
	void disp()
	{
		System.out.println("This is disp method");
	}

}
class car extends vehicle
{
	
}
class bike extends vehicle
{
	
}
class scooter extends vehicle 
{
	
}

public class Testcase3 {

	public static void main(String[] args) {


		car c=new car();
		c.disp();
		
		bike b=new bike();
		b.disp();
		
		scooter s=new scooter();
		s.disp();

	}

}
