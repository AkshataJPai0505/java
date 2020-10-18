package JavaBasics;

public class sample3 {
	static int a;
	int b;
	public static void main(String args[])
	{
		System.out.println("This is main");
		sample3 s=new sample3();
	}
	static
	{
		a=20;
		System.out.println("The value of static variable is" +a);
	}
	{
		b=50;
		System.out.println("The value of Non static variable is" +b);
	}
}
