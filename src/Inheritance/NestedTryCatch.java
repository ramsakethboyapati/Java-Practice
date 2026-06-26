package Inheritance;

import java.util.Scanner;

public class NestedTryCatch {
	
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
		}
		catch(Exception e) {
			System.out.println("from outer catch");
		}
	}
	public static void main(String[] args) {
		NestedTryCatch n= new NestedTryCatch();
		n.displayException();
	}

}
