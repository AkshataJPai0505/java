package Functions;

//Static method with return type and arguements

public class Example8 {

	public static void main(String[] args) {
		System.out.println("This is main method");
		Example8  e= new Example8();
		e.display(20);
	}
	int display(int a)
	{
		System.out.println("The value of a is "+a);
		return a;
	}

}
