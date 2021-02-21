package Constructors;

public class Example3 {
	Example3(int a){
		System.out.println("The value of a is "+a);
	}
	Example3(int a,double b){
		System.out.println("The value of a is "+a+"\n"+"The value of b is "+b);
	}
	Example3(char c,String d,float e){
		System.out.println("The value of c is "+c+"\n"+"The value of d is "+d+"\n"+"The value of e is "+e);
	}
	public static void main(String[] args) {
		
		Example3 e1=new Example3(10);
		Example3 e2=new Example3(20,3.141623456789);
		Example3 e3=new Example3('A',"Akshata J Pai",5);
	}

}
