package FunctionsCalling;

public class Example5 {

	public static void main(String[] args) {
		Example5 e=new Example5();
		e.no(1);

	}
	void no(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			no(n+1);
		}
	}

}
