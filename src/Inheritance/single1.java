package Inheritance;
class test1{
	void disp() {
		System.out.println("This is disp method");
	}
}
class sample11 extends test1{
	void demography()
	{
		System.out.println("This is demography method");
	}
	sample11()
	{
		System.out.println("This is sample11");	
	}
}
public class single1 {

	public static void main(String[] args) {
		
		sample11 s1 =new sample11();
		s1.disp();
		s1.demography();
	}

}
