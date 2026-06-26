package java_basics;

public class Array_12 {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,7,8,9,4};
		int arr1[]=new int[arr.length];
		int count=7;
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[count];
			count--;
		}
		
		for(int x:arr1) {
			System.out.print(x+" ");
		}
		

	}

}
