package Interviewcode;

import java.util.Scanner;

public class Amstrongno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arm=0,r,no;
		no=n;
		
		while(no!=0)
		{
			r=no%10;
			arm=arm+r*r*r;
			no=no/10;
			}
		if(arm==n)
		{
			System.out.println("Its amstrong no");
		
		}
		else {
			System.out.println("Its  not amstrong no");
		}
	}

}
