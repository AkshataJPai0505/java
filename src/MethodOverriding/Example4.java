package MethodOverriding;
class test{
	void disp() {
		System.out.println("Akshata stays in Bangalore");
	}
}
class sample extends test{
	void disp() {
		System.out.println("Akshata  currently stays in Mangalore");
	}
}

public class Example4 {

	public static void main(String[] args) {
		
		sample s=new sample();
		s.disp();
	}

}
