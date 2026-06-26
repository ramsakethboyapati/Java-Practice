//WAP to print the only owels from the character array 
package java_basics;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char [] arr= new char[10];
		for(int j=0;j<arr.length;j++) {
			sc.nextLine();
			arr[j]=sc.next().charAt(0);
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			switch(arr[i]){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(arr[i]+" ");
			
			}
        	
        }

	}

}
