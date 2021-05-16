package Inheritance;
class reservebank
{
	void disp()
	{
		System.out.println("This is disp method");
	}
}
class bank extends reservebank
{
	void test()
	{
		System.out.println("This is test method");
	}
}

public class Testcase2 extends bank {

	public static void main(String[] args) {
		Testcase2 t=new Testcase2();
		t.disp();
		t.test();

	}

}
