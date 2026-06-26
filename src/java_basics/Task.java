package java_basics;
import java.util.*;
import java.io.*;

public class Task {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		String s1;
		do {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		char ch=sc.next().charAt(0);
		
		
		switch(ch) {
		case '+':{
			System.out.println(num1+num2);
			break;
		}
		case '-':{
			System.out.println(num1-num2);
			break;
		}
		case '*':{
			System.out.println(num1*num2);
			break;
		}	
		case '/':{
			System.out.println(num1/num2);
			break;	
		}
		
		}
		System.out.println("enter s for exiting the program");
		sc.nextLine();
		s1=sc.nextLine();
		
		}while(!"s".equals(s1));	
		
	}

}
