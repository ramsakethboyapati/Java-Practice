package java_basics;
import java.util.*;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		switch(str) {
		case "java" ->
			System.out.println("java");
			
		case "python" ->
			System.out.println("python");
		}

	}

}
