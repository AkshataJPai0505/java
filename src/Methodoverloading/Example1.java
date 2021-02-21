package Methodoverloading;
class test{
	test()
	{
		System.out.println("This is a test constructor");
	}
}
class  sample  extends test {
	
	sample()
	{
		super();
		System.out.println("This is a sample constructor");
	}
}

public class Example1 {

	public static void main(String[] args) {
		sample s=new sample();

	}

}
