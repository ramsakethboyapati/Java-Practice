package java_basics;

public class Array_2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i+1];
		}
		arr[4]=temp;

	}

}
