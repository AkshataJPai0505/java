package Functions;
//Non static method without return type

public class Example5 {

	public static void main(String[] args) {
		System.out.println("This is main method");
		Example5 e= new Example5();
		e.display();

	}
	void display()
	{
		System.out.println("This is non static");
	}

}
