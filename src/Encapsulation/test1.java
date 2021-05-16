package Encapsulation;
class demo{
	private int no;
	public void setter(int i) {
		no=i;
	}
	public int getter()
	{
		return no;
	}
}
public class test1 {

	public static void main(String[] args) {
		demo d=new demo();
		
		d.setter(5);
		System.out.println("The value of i "+d.getter());

	}

}
