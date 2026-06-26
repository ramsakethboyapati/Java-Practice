package java_basics;

public class Array_13 {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,7,8,9,4};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
		

	}

}
