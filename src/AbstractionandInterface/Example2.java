package AbstractionandInterface;
abstract class test1
{
	abstract void disp();
	
	void text()
	{
		System.out.println("This is text");
	}
}
class demo1 extends test1{
	void disp()
	{
		System.out.println("This is disp method");
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		demo1 d1=new demo1();
		d1.text();
		d1.disp();
	}

}
