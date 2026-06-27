package Oops;

import java.util.Scanner;

public class nestedTryCatchFinally {
	
	public void displayException(){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int res=a/b;
			System.out.println("the res vlue is "+res);
		
		try {
			int []arr= {1,2,3,4,5};
			arr[10]=100;
		}
		catch(ArithmeticException e) {
			System.out.println("from inner catch");
		}
		finally {
			System.out.println("inner finally ");
		}
		}
		catch(Exception e) {
			System.out.println("from outer catch");
		}
		finally {
			System.out.println("outer finally");
		}
	}

	public static void main(String[] args) {
		nestedTryCatchFinally n= new nestedTryCatchFinally();
		n.displayException();
		

	}

}
