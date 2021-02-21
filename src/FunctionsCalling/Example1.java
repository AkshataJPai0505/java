package FunctionsCalling;

public class Example1 {
	void disp() {
		for (int i=0;i<=3;i++) {
			System.out.println(i);
		}
	}
	void func(String a) {
		System.out.println(a);
		disp();
	}

	public static void main(String[] args) {
		
		Example1 e=new Example1();
		e.func("A");

	}

}
