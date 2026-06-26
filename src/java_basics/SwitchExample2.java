package java_basics;
import java.util.*;
import java.io.*;

public class SwitchExample2 {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		while(true) {
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
		System.out.println("enter no for exiting the program");
		sc.nextLine();
		String s1=sc.nextLine();
		if(s1.equals("no")) {
			System.out.println("exiting program");
			break;
		}
		
		}	
		
	}

}
