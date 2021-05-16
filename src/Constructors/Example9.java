package Constructors;

public class Example9 {
	Example9()
	{
		System.out.println("No arguments constructor");
	}
	Example9(int a,int b)
	{
		this();
		System.out.println("arguments with same type");
	}
	
	Example9(int a,char b, String c)
	{
		this(10,20);
		System.out.println("arguments with different type");
	}
	public static void main(String[] args) {
		new Example9(10,'A',"Akshata");
	
	}

}
