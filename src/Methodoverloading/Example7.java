package Methodoverloading;

class test6{
	test6(int a)
	{
		System.out.println("This is a test constructor with value is "+a);
	}
}
class  sample6  extends test6 {
	
	sample6()
	{
		super(20);
		System.out.println("This is a sample constructor");
	}
}
class  main6  extends sample6 {
	
	main6(double b,char c,String d)
	{
		
		System.out.println("This is a main constructor and the value of b,c,d "+b +c +d);
	}
}

public class Example7 {

	public static void main(String[] args) {
		main6 e=new main6(56.8,'a',"Akshata");

	}

}


