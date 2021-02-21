package Polymorphism;

class cars
{
	void disp()
	{
		System.out.println(" Cars are manufactured by different countries across the globe");
	}
}
class hyundai extends cars
{
	void disp()
	{
		System.out.println(" Hyundai Cars are manufactured  in South Korea");
	}
}
class mahindra extends cars
{
	void disp()
	{  
		super.disp();
		System.out.println(" Mahindra Cars are manufactured  in India");
	}
}
class toyota extends cars
{
	void disp()
	{
		System.out.println(" Toyota Cars are manufactured  in Japan");
	}
}
class ford extends cars
{
	void disp()
	{
		System.out.println(" Ford Cars are manufactured  in USA");
	}
}

public class runtime {
	public static void main(String args[])
	{
		cars c =new hyundai();
		c.disp();
		cars c1 =new mahindra();
		c1.disp();
		
	}

}
