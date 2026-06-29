package Dsa;

public class RotateArray {
	
	public void rotate(int arr[]) {
		
		int first=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=first;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		RotateArray r=new RotateArray();
		r.rotate(arr);

	}

}