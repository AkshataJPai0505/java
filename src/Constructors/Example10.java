package Constructors;

public class Example10 {
	int x=50;
	
	void disp(int x)
	{  
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		Example10 e=new Example10();
		e.disp(100);
		

	}

}
