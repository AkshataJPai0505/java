package FunctionsCalling;

public class Example2 {
	void disp() {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		
		
		Example2 e=new Example2();
		e.disp();
	}

}
