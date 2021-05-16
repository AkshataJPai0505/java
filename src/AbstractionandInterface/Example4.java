package AbstractionandInterface;
interface demo3{
	void test();	
}
class main implements demo3{
	public void test() 
	{
		System.out.println("This is test method");
	}
}

public class Example4 {

	public static void main(String[] args) {
		main m=new main();
		m.test();

	}

}
