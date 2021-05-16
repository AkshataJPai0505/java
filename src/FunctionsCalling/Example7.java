package FunctionsCalling;
class demo1
{
	demo1()
	{
		System.out.println("This is demo1");
	}
}
class test1 extends demo1
{
	test1(int a)
	{
		super();
		System.out.println("This is test1");
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t=new test1(10);

	}

}
