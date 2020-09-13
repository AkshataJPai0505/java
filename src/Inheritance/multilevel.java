package Inheritance;
class demo1
{
	void disp1()
	{
		System.out.println("Namaste Bengaluru");
	}
}
class sample1 extends demo1
{
	void test1()
	{
		System.out.println("My name is Akshata J Pai");
	}
}
class example1 extends sample1
{
	void com1()
	{
		System.out.println("I work for Tech Mahindra");
	}
}

public class multilevel {
	public static void main(String args[])
	{
		example1 e=new example1();
		e.disp1();
		e.test1();
		e.com1();
	}

}
