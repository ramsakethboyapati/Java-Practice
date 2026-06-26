package java_basics;

public class ConstructorDemo {
	private int num1;
	private int num2;
	
	ConstructorDemo(){
		this(2,5.64);
		num1=232;
		num2=987;
		System.out.println("hii");
	}
	ConstructorDemo(int num1,int num2){
		
		this.num1=num1;
		this.num2=num2;
		System.out.println("abcd");
	}
	ConstructorDemo(int num1,double d1){
		this(2,3);
		System.out.println("hello");
	}
	
	
	
	
	 static void displayValues() {
		 ConstructorDemo d = new ConstructorDemo();
		d.add();//calling private method
		System.out.println("value of num1:"+d.num1);
		System.out.println("value of num2:"+d.num2);
	}
	private void add() {
		System.out.println(num1+num2);
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo c3=new ConstructorDemo();
		c3.displayValues();

	}

}
