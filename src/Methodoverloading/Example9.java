package Methodoverloading;

public class Example9 {
	void disp(int a) {
		System.out.println("The method is display with value is "+a);
	}
	void disp(int a, int b) {
		System.out.println("The method is display with value is "+a+"\n"+b);
	}
	void disp(double a, char b,String c) {
		System.out.println("The method is display with value is "+a+"\n"+b+"\n"+c);
	}
	public static void main(String[] args) {
		Example9 e1= new Example9();
		e1.disp(10);
		e1.disp(10,20);
		e1.disp(94.4,'A',"Akshata");

	}

}
