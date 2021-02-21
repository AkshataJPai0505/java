package FunctionsCalling;

public class Example4 {
	void disp(int i) {
		if(i<=10)
		{
			System.out.println(i);
			i++;
			disp(i);
		}
	}

	public static void main(String[] args) {
		Example4 e=new Example4();
		e.disp(1);
		
	}

}
