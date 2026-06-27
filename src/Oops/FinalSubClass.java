package Oops;

public class FinalSubClass extends FinalDemo{
	public FinalSubClass() {
		a=10;
		b=20;
		System.out.println("this is FinalSubClass constructor");
	}
	void addition() {
		int res=a+b;
		System.out.println(res);
	}
}
