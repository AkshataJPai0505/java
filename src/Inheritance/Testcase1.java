package Inheritance;
class samp
{
	void disp()
	{
		System.out.println("This is disp method");
	}
}

public class Testcase1 extends samp {

	public static void main(String[] args) {

		Testcase1 t=new Testcase1();
		t.disp();
	}

}
