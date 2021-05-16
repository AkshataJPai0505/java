package FunctionsCalling;
class demo
{
	demo()
	{
		System.out.println("This is demo");
	}
}
class test extends demo
{
	test()
	{
		System.out.println("This is test");
	}
}

public class Example6 {

	public static void main(String[] args) {
		test t=new test();

	}

}
