package composition;
class demo
{
	int a=50;
	static int b=100;
	void disp()
	{
		System.out.println("Hello world");
	}
	static void test()
	{
		System.out.println("Namaste");
	}
}

public class main {


	public static void main(String[] args) {
		demo d=new demo();
	     d.disp();
		System.out.println(d.a);
		demo.test();
		System.out.println(demo.b);
		
	}

}
