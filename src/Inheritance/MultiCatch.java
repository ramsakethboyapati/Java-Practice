package Inheritance;

import java.util.Scanner;

public class MultiCatch {
	
	public void showException() {
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		try {
			int res=a/b;
			int []arr= {1,2,3,4,5};
			arr[10]=100;
			Integer i1=null;
			int z=a*i1;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		MultiCatch m=new MultiCatch();
		m.showException();

	}

}
