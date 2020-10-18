package JavaBasics;

public class sample1 {
	public static void main(String args[])
	{
		System.out.println("This is main");
	}
	static {
		System.out.println("This is Static Block");
	}
	//Inorder to Execute Non Static Block Object has to be created
	{
		System.out.println("This is Non-Static Block");
	}

}
