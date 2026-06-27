package Oops;

public class InterfaceImpl  implements InterfaceDemo{
	public InterfaceImpl() {
		System.out.println("this is InterfaceImpl class contructor");
	}
	public void display() {
		System.out.println("The value of a is"+a);
		System.out.println("The value of b is"+b);
		
	}
	@Override
	public void Addition() {
		System.out.println(a+b);
		
	}

}
