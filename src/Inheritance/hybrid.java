package Inheritance;
class grandparents
{
	void food()
	{
		System.out.println("Grandparents love Veg food");
	}
}
class parents1 extends grandparents
{
	void sweets() {
		System.out.println("parents1 love sweets");
	}
}
class parents2 extends grandparents
{
	void nonveg() {
		System.out.println("parents2 love nonveg");
	}
}
class children extends parents1
{
	void chocolate()
	{
		System.out.println("children love chocolate");
	}
}
public class hybrid {
	public static void main(String args[])
	{
		parents1 p1=new parents1();
		parents2 p2=new parents2();
		children c=new children();
		
		p1.food();
		p1.sweets();
		
		p2.food();
		p2.nonveg();
		
		c.food();
		c.sweets();
		c.chocolate();
	}

}
