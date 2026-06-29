package Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
	public void task(int arr[]) {
		int sum=0;
		
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int n= arr[arr.length-1 ];
		int totalSum=(n*(n+1))/2;
		System.out.println("missing element= "+(totalSum-sum));
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8};
		MissingElement m=new MissingElement();
		m.task(arr);
		
	}

}
