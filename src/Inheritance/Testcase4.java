package Inheritance;
class milkyway{
	
	void disp()
	{
		System.out.println("This is our home galaxy");
	}

}
class stars extends milkyway
{
	
}
class planets extends milkyway
{
	
}
class earth extends planets
{
	
}
public class Testcase4 {

	public static void main(String[] args) {
		earth e=new earth();
		e.disp();
		planets p=new planets();
		p.disp();
		stars s=new stars();
		s.disp();

	}

}
