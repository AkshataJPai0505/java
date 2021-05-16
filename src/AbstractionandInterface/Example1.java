package AbstractionandInterface;
abstract class test
{
	abstract void disp();
}
class demo extends test{
	void disp()
	{
		System.out.println("This is disp method");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		demo d=new demo();
		d.disp();

	}

}
