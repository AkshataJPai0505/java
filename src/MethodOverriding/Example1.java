package MethodOverriding;
class laptops 
{
	void disp()
	{
		System.out.println("Laptops are the  portable computers");
	}
}
class hawlettpackcard extends laptops
{
	void disp()
	{
		System.out.println(" HP Laptops are one of the best laptops in the world");
	}
}

public class Example1 {
	public static void main(String args[]) {
	hawlettpackcard e= new hawlettpackcard();
	e.disp();
}
}
