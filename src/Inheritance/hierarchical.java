package Inheritance;
class parent
{
	void display() {
		System.out.println("Parents love their children");
	}
}
class child1 extends parent
{
	
}
class child2 extends parent
{
	
}
class child3 extends parent
{
	
}
public class hierarchical {
	public static void main(String arg[])
	{
		child1 c1=new child1();
		child2 c2=new child2();
		child3 c3=new child3();
		c1.display();
		c2.display();
		c3.display();
		
		
		
		
	}

}
