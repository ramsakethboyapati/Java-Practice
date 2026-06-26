package java_basics;

public class Rectangle extends Shape {
	public Rectangle() {
		len=10;
		bre=20;
		System.out.println("Statement from sub class constructor");
	}
	void area() {
		int res=len*bre;
		System.out.println("the result value is "+res);
	}
	public static void main(String[] args) {
		
	}

}
