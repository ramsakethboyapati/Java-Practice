package Inheritance;

public class SampleClass {
	private int num1;
	private int num2;
	
	SampleClass(){
		num1=100;
		num2=200;
	}
	void display() {
		System.out.println(num1);
		System.out.println(num2);
	}
	

	@Override
	public String toString() {
		return "SampleClass [num1=" + num1 + ", num2=" + num2 + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
