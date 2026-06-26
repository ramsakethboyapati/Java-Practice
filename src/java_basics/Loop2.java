package java_basics;
import java.util.*;
//WAP to find sum of i values

public class Loop2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<n;i++) {
			prod=prod*i;
		}
		System.out.println(prod);

	}

}
