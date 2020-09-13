package Basics;

public class multiply {
	double mul(int a,double d,int c)
	{
		double res=a*d*c;
		System.out.println("The result is"+res);
		return res;
	}
	public static void main(String args[])
	{
		multiply m = new multiply();
		m.mul(10,2.5,5);
		//System.out.println("abcd");
	}

}
