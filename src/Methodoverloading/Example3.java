package Methodoverloading;

class test2{
	test2()
	{
		System.out.println("This is a test constructor");
	}
}
class  sample2  extends test2 {
	
	sample2(int a)
	{
		
		System.out.println("This is a sample constructor with value "+a);
	}
}

public class Example3 {

	public static void main(String[] args) {
		sample2 s=new sample2(20);

	}

}


