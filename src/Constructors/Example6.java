package Constructors;

public class Example6 {
	Example6()
	{
		System.out.println("No arguments constructor");
	}
	Example6(int a,int b)
	{
		System.out.println("arguments with same type");
	}
	
	Example6(int a,char b, String c)
	{
		System.out.println("arguments with different type");
	}
	public static void main(String[] args) {
		
		new  Example6();
		new  Example6(20,10);
		new  Example6(10,'A',"Akshata");
	}

}
