package Methodoverloading;

public class Example10 {
	 static void disp(int a) {
		System.out.println("The method is display with value is "+a);
	}
	 static void disp(int a, int b) {
		System.out.println("The method is display with value is "+a+"\n"+b);
	}
	 static void disp(double a, char b,String c) {
		System.out.println("The method is display with value is "+a+"\n"+b+"\n"+c);
	}

	public static void main(String[] args) {
		Example10.disp(20);
		Example10.disp(20,30);
		Example10.disp(94.4,'A',"Akshata");

	}

}
