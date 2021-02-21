package Constructors;

public class Example4 {
	Example4(int a){
		System.out.println("the value of a is "+a);
	}
	Example4(String b){
		this(50);
		System.out.println("the value of b is "+b);
	}
	Example4(){
		this("Akshata");
		System.out.println("This is constructor ");
	}
	public static void main(String[] args) {
		
		Example4 e=new Example4();
	}

}
