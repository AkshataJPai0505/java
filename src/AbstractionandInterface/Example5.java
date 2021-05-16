package AbstractionandInterface;
interface I1
{
	void test();
}
interface I2
{
	void disp();
}
interface I3
{
	void main();
}
class top implements I1,I2,I3
{
	public void test() 
	{
		System.out.println("This is test method");
	}
	public void disp() 
	{
		System.out.println("This is disp method");
	}
	public void main() 
	{
		System.out.println("This is main method");
	}
}
public class Example5 {

	public static void main(String[] args) {
		top t=new top();
		t.test();
		t.disp();
		t.main();

	}

}
