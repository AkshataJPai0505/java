package Interviewcode;

public class commonelementsoftwoarrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		int b[]= {100,20,30,40,50,60,70,80};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
