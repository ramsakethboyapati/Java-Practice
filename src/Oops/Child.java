package Oops;

public class Child extends Parent{
	
	int e,f;
	public Child() {
		e=10;
		f=20;
		System.out.println("sub class constructor");
	}
	void display() {
		System.out.println(e);
		System.out.println(f);
	}
	void sum() {
		int sum=a+b+c+d+e+f;
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		

	}

}
