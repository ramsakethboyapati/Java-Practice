package Oops;

public class FinalDemo {

	protected int a,b;
	public FinalDemo() {
		a=100;
		b=200;
		System.out.println("Final super class Constructor");
	}
	void display() {
		System.out.println("the value of a"+a);
		System.out.println("the value of b"+b);
	}
	void addition() {
		System.out.println("the addition method of final class");
	}

}
