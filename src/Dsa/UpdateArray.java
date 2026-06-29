package Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateArray {
	public void update(int arr[],int position,int element) {
		if(position<0 || position>=arr.length) {
			System.out.println("invalid updation");
		}
		else {
			arr[position]=element;
		}
		System.out.println("updated array is:"+Arrays.toString(arr));	
		
	}
	public static void main(String[] args) {
		int arr[]= {1,8,3,9,2,47};
		Scanner sc= new Scanner(System.in);
		int position=sc.nextInt();
		int element=sc.nextInt();
		
		UpdateArray e=new UpdateArray();
		e.update(arr,position,element);
		
	}

}
