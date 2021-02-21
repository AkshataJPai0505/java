package Methodoverloading;

class test4{
	test4()
	{
		System.out.println("This is a test constructor");
	}
}
class  sample4  extends test4 {
	
	sample4()
	{
		
		System.out.println("This is a sample constructor");
	}
}
class  main4  extends sample4 {
	
	main4()
	{
		
		System.out.println("This is a main constructor");
	}
}

public class Example5 {

	public static void main(String[] args) {
		main4 e=new main4();

	}

}
