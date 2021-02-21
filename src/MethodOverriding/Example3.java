package MethodOverriding;
class mobile
{
	void disp()
	{
		System.out.println("mobiles are potable telephones");
	}
}
class smartphone extends mobile
{
	void disp()
	{
		
		System.out.println("SAMSUNG smartphones are  best smartphones in the world");
		super.disp();
	}
}

public class Example3 {
	public static void main(String args[]) {
		smartphone e= new smartphone();
	e.disp();
}
}
