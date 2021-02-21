package Methodoverloading;

class test7{
	test7(int a)
	{
		System.out.println("This is a test constructor with value is "+a);
	}
}
class  sample7  extends test7 {
	
	sample7()
	{
		super(20);
		System.out.println("This is a sample constructor");
	}
}
class  main7  extends sample7 {
	
	main7(double b,char c,String d)
	{
		super();
		System.out.println("This is a main constructor and the value of b,c,d "+b +c +d);
	}
}

public class Example8 {

	public static void main(String[] args) {
		main7 e=new main7(57.8,'a',"Akshata");

	}

}
