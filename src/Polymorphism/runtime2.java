package Polymorphism;
class animals{
	void sound()
	{
		System.out.println("All animals make noise");
	}
}
class cat extends animals{
	void sound()
	{
		System.out.println("cat sound is meow");
	}
}
class dog extends animals{
	void sound()
	{
		System.out.println("dog sound is barking");
	}
}
	class lion extends animals{
		void sound()
		{
			System.out.println("lion sound is roaring");
		}
	}
public class runtime2 {

	public static void main(String args[]) 
	{
		animals a=new lion();
		a.sound();
	}

}

