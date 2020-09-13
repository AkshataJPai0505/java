
	package Basics;
	import java.util.Scanner;

	public class sample1 {
		public static void main(String args[])
		{
	Scanner input=new Scanner(System.in);
		System.out.println("Enter the quantity");
		int kg=input.nextInt();
//		System.out.println("The qauntity="+kg);
		System.out.println("Enter the price");
		int price=input.nextInt();
		int total=kg*price;
		if(total>1000)
		{
			int finalprice =total-200;
			System.out.println("The amount="+finalprice);
		}
		else
		{
			System.out.println("The amount="+total);
		}
	}
	}


