package ExceptionHandling;

public class ExceptionMadan extends Exception {
	public void m1() throws Exception{
		int age =14;
		if(age>18) {
			System.out.println("eligible");
		}
		else {
			throw new ExceptionMadan();
		}
		
	}

	public static void main(String[] args) throws Exception{
		ExceptionMadan e= new ExceptionMadan();
		e.m1();
		
		
		

	}

}
