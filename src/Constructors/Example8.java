package Constructors;

public class Example8 {
	int a;
	void disp(int a)
	{
		this.a=a;
		System.out.println("The value of a is "+a);
	}

	public static void main(String[] args) {
		Example8 e=new Example8();
		e.disp(50);

	}

}
