package AbstractionandInterface;

abstract class test2
{
	abstract void disp();
	
	abstract void text();
	
}
abstract class demo2 extends test2{
	void main()
	{
		System.out.println("This is main method");
	}
	
}
class topic extends demo2{
	void disp()
	{
		System.out.println("This is disp method");
	}
	void text()
	{
		System.out.println("This is text method");
	}

	
}


public class Example3 {

	public static void main(String[] args) {
		topic  t=new topic();
		t.disp();
		t.text();
		t.main();

	}

}
