package java_basics;
import java.util.*;
//WAP to find sum of i values

public class Reverse_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		int temp=0;
		for(;n!=0;) {
			temp=n%10;
			reverse=reverse*10+temp;
			n=n/10;
		}
		System.out.println(reverse);

	}

}
