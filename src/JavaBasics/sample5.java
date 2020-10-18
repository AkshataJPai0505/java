package JavaBasics;

public class sample5 {

	public static void main(String[] args) {
		 
		System.out.println("This is main method");
		example e=new example();

	}

}
class example
{
	static int a;
	int b;
	static
	{
		a=10;
		System.out.println("The value of static variable is "+a);
	}
	{
		b=20;
		System.out.println("The value of non static variable is "+b);
	}
}
