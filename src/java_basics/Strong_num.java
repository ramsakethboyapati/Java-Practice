package java_basics;

import java.util.Scanner;

public class Strong_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
		int strong=n;
		
		
		for(;n!=0;) {
			int temp=n%10;
			int product=1;
			for(int i=1;i<=temp;i++) {
				product=product*i;
			}
			sum =sum+product;
			n=n/10;
		
		}
		if(strong==sum) {
			System.out.println("Strong num");
			
		}
		else {
			System.out.println("not a strong number");
		}

	}

}
