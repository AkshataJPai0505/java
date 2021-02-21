package MethodOverriding;
class cars 
{
	void disp()
	{
		System.out.println("cars are manufactured by many countries");
	}
}
class tata extends cars
{
	void disp()
	{
		super.disp();
		System.out.println(" TATA cars are manufactured in India");
	}
}

public class Example2 {
	public static void main(String args[]) {
		tata e= new tata();
	e.disp();
}
}
