package MethodOverriding;
class planets
{
	void disp()
	{
		System.out.println("There are eight planets in our solar system");
	}
}
class earth extends planets
{
	void disp()
	{
		super.disp();
		System.out.println("Earth is our home planet");
		
	}
}

public class Example6 {

	public static void main(String[] args) {
		earth e=new earth();
		e.disp();

	}

}
