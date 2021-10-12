package Inheritance;

class check{
	int a=20;
	static int b=30;
	static String c;
	void disp()
	{
		System.out.println("This is a non static method");
	}
	static void test() {
		System.out.println("This is a  static method");
		
	}
}

public class exam extends check {

	public static void main(String[] args) {
		
		exam e=new exam();
		e.disp();
		exam.test();
		System.out.println(e.a);
		System.out.println(exam.b);
		System.out.println(exam.c);
		
	}

}
