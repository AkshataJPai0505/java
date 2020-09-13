package Inheritance;

class demo
{
	void disp()
	{
		System.out.println("Hello world");
	}
}
class sample extends demo
{
	void test()
	{
		System.out.println("Love to be TechM");
	}
}

public class single {
	public static void main(String arg[])
	{
		sample s=new sample();
		s.disp();
		s.test();
	}

}
