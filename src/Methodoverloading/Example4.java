package Methodoverloading;

class test3{
	test3()
	{
		System.out.println("This is a test constructor");
	}
}
class  sample3  extends test3 {
	
	sample3()
	{
		
		System.out.println("This is a sample constructor");
	}
}

public class Example4 {

	public static void main(String[] args) {
		sample3 s=new sample3();

	}

}


