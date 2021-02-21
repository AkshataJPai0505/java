package MethodOverriding;

class mobilephone
{
	void disp() {
		System.out.println("The first mobile phone was used in 1995");
	}
	
}
class touchscreenmobile extends mobilephone {
	
	void disp() {
		super.disp();
		System.out.println("The smartphone came into existence from 2010");
	}
}
public class Example5 {

	public static void main(String[] args) {
		touchscreenmobile t=new touchscreenmobile();
		t.disp();

	}

}
