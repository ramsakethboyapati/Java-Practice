package Inheritance;

public class GrandParent {
	int a,b;
	public GrandParent() {
		a=30;
		b=40;
		System.out.println("Grand parent non parameterized constructor");
	}
	public void showValues() {
		System.out.println(a);
		System.out.println(b);
	}

}
