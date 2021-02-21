package Constructors;



public class Example1 {
	int a;
	Example1(int a){
		this.a=a;
		System.out.println("The value of a is "+a);
	}

	public static void main(String[] args) {
		Example1 e= new Example1(10);

	}

}
