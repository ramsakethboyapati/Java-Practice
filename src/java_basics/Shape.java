package java_basics;

public class Shape {
	protected int len,bre;
	Shape(){
		len=100;
		bre=200;
		System.out.println("statements from super class constructor");
	}
	
	public void display() {
		System.out.println("the value of len"+len);
		System.out.println("the value of bre"+bre);
	}

	public static void main(String[] args) {
		

	}

}
