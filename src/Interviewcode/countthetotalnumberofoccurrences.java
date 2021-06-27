package Interviewcode;

public class countthetotalnumberofoccurrences {

	public static void main(String[] args) {
		String s="akshata";
		int count=s.length()-s.replace("k","").length();
		System.out.println(count);

	}

}
