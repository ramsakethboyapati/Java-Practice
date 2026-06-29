package Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public void remove(int arr[]) {
		int count=0;
		int arrNew[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			boolean visited=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					visited=true;
					break;
				}

			}
			if(!visited) {
				arrNew[count]=arr[i];
				count++;
			}
		}
		
		for(int k=0;k<count;k++) {
			System.out.print(arrNew[k]+" ");
		}
		
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1,8,1,0,9,2,47,2,1};
		RemoveDuplicates r=new RemoveDuplicates();
		r.remove(arr);
		
	}

}
