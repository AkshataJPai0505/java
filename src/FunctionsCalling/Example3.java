package FunctionsCalling;

public class Example3 {
	void disp(int i) {
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		
		
		Example3 e=new Example3();
		e.disp(1);
	}

}
