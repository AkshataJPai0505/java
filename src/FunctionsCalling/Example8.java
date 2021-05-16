package FunctionsCalling;
class bank
{
	bank(int a,int b)
	{
		System.out.println("This is bank with value"+a+" "+b);
	}
}
class account extends bank
{
	account(double a,char b,String c)
	{
		super(10,20);
		System.out.println("This is account  with value"+a+" "+b+" "+c);
	}
}

public class Example8 {

	public static void main(String[] args) {
		new account(45.67,'A',"Akshata");

	}

}
