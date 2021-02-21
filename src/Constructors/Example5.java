package Constructors;

public class Example5 {
	Example5(){
		System.out.println("This is constructor");
	}
	Example5(String a){
		this();
		System.out.println("The value of a is "+a);
	}
	Example5(char c,int a){
		this("Akshata");
		System.out.println("The value of a is "+a+" "+"The value of c is "+c);
	}
	public static void main(String[] args) {
		
		Example5 e=new Example5('A',10);

	}

}
