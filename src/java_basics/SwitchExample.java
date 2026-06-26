package java_basics;
import java.util.*;
import java.io.*;

public class SwitchExample {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		char ch=(char)(System.in.read());
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
		{
			System.out.println("given character is vowel");
			break;
		}
		default:
		{
			System.out.println("given character is consonent");
		}
		
		}

	}

}
