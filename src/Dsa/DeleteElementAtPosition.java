package Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementAtPosition {
	public void delete(int arr[],int position) {
		int arrNew[]=new int[arr.length-1];
		for(int i=0;i<position;i++) {
			arrNew[i]=arr[i];
		}
		for(int j=position;j<arrNew.length;j++) {
			arrNew[j]=arr[j+1];
		}
		
		System.out.println("updated array is:"+Arrays.toString(arrNew));	
		
	}
	public static void main(String[] args) {
		int arr[]= {1,8,3,9,2,47};
		Scanner sc= new Scanner(System.in);
		int position=sc.nextInt();
		
		
		DeleteElementAtPosition d=new DeleteElementAtPosition();
		d.delete(arr,position);
		
	}

}
