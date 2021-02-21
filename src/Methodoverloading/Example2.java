package Methodoverloading;

class test1{
	test1()
	{
		System.out.println("This is a test constructor");
	}
}
class  sample1  extends test1 {
	
	sample1(int a)
	{
		super();
		System.out.println("This is a sample constructor with value "+a);
	}
}

public class Example2 {

	public static void main(String[] args) {
		sample1 s=new sample1(20);

	}

}

