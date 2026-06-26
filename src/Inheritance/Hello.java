package Inheritance;

public class Hello {
	
	void m1() {
		
	}
	void m2() {
		m1();
	}
	static void m3() {
		Hello h= new Hello();
		h.m1();
	}

	public static void main(String[] args) {
		

	}

}
