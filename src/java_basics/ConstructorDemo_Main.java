package java_basics;

public class ConstructorDemo_Main {

	public static void main(String[] args) {
		ConstructorDemo c1=new ConstructorDemo();//object creation
		c1.displayValues();//calling instance method using object
		ConstructorDemo c2=new ConstructorDemo(10,12);//parameterized constructor
		c2.displayValues();

	}

}
