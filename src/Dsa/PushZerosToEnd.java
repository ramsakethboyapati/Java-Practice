package Dsa;

import java.util.Arrays;

public class PushZerosToEnd {
	
	public void task(int arr[]) {
		int arrNew[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arrNew[j]=arr[i];
				j++;
			}
		}
		System.out.println("updated array is:"+Arrays.toString(arrNew));	
	}

	public static void main(String[] args) {
		int arr[]= {1,0,3,9,0,47};
		PushZerosToEnd p= new PushZerosToEnd();
		p.task(arr);

	}

}
