package Looping;

public class Testcase2 {

	public static void main(String[] args) {
		Testcase2 tc=new Testcase2();	
		tc.disp(20);
		
	}
	int disp(int a)
	{
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"is even");
			}
			else
			{
				System.out.println(i+"is odd");
			}
		}
		return a;
	}

}
