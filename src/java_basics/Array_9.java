//WAP to print the only owels from the character array 
package java_basics;

import java.util.Scanner;

public class Array_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		char [] str1=str.toCharArray();
		String sum="";
		for(int i=str1.length-1;i>=0;i--) {
			sum=sum+str1[i];	
        }
		if(sum.equals(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
