package Inheritance;

public abstract class AbstractDemo {
	
	protected int num1;
	protected int num2;
	public AbstractDemo() {
		num1=100;
		num2=200;
		System.out.println("Statements from abstract class constructor");
	}
	void display() {
		System.out.println("the value of num1"+num1);
		System.out.println("the value of num2"+num2);
	}
	abstract void addition();

}
