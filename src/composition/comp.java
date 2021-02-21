package composition;
class test{
	void disp()
	{
		System.out.println("This is disp method");
	}
}

public class comp {

	public static void main(String[] args) {
		test t = new test();
		t.disp();
	}

}
