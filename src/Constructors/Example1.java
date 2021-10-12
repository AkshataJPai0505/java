package Constructors;



public class Example1 {
	int a=50;
	Example1(int a){
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of a is "+this.a);
	}

	public static void main(String[] args) {
		Example1 e= new Example1(10);

	}

}
