package Oops;

public class Abstract_SubClass extends AbstractDemo {
	public Abstract_SubClass() {
		System.out.println("sub_class constructor");
	}
	
	@Override
	void addition() {
		int result=num1+num2;
		System.out.println(result);
		
	}

}
