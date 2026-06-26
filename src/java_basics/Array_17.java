package java_basics;

public class Array_17 {

	public static void main(String[] args) {
		int arr[]= {0,2,5,0,7,0,9,4};
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		for(int x:arr) {
			System.out.print(x+",");
		}

	}

}
