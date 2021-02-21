package Methodoverloading;

class test5{
	test5()
	{
		System.out.println("This is a test constructor");
	}
}
class  sample5  extends test5 {
	
	sample5()
	{
		super();
		System.out.println("This is a sample constructor");
	}
}
class  main5  extends sample5 {
	
	main5()
	{
		super();
		System.out.println("This is a main constructor");
	}
}

public class Example6 {

	public static void main(String[] args) {
		main5 e=new main5();

	}

}
