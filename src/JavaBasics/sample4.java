package JavaBasics;

public class sample4 {
	public static void main(String args[])
	{
		demo d=new demo();
		System.out.println("This is main");
		
	}
}

class demo
{
	static int a;
	int b;
	static {
		a=10;
		System.out.println("The static variable is "+a);
	}
	{
		b=20;
		System.out.println("The non static variable  is "+b);
	}
}