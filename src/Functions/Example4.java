package Functions;

//Static method with return type and arguements

public class Example4 {
	public static void main(String args[]) {
		
	System.out.println("This method is main");
	Example4.display(20);

}
static int display(int a)
{
	System.out.println("The value of a is "+a);
	return a;
}
}
