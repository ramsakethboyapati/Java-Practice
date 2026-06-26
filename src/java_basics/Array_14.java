package java_basics;

public class Array_14 {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,7,8,9,4};
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
		
		
		

	}

}
