package Interviewcode;

import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		System.out.println("Enter the value of c");
		int c=s.nextInt();
		if((a>b) && (a>c))
		{
			System.out.println("a is the largest no");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("b is the largest no");
		}
		else
		{
			System.out.println("c is the largest no");
		}

	}

}
