package Constructors;

public class Example2 {
	int a;
	int b;
	Example2(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("The value of a is "+a+"\n"+"The value of b is "+b);
	}

	public static void main(String[] args) {
		
		Example2 e=new Example2(10,20);

	}

}
