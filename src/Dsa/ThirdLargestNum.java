package Dsa;

public class ThirdLargestNum {
	public void thirdLargestElement(int arr[]) {
		int largest=arr[0];
		int slargest=0;
		int thirdLargest=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				thirdLargest=slargest;
				slargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>slargest){
				thirdLargest=slargest;
				slargest=arr[i];
				
			}
			else if(arr[i]>thirdLargest) {
				thirdLargest=arr[i];
			}
		}
		System.out.println("third largest "+thirdLargest);
		

	}
	

	public static void main(String[] args) {
		int []arr= {1,5,8,4,9,9,6,6,7,9,1,2,4,4,4};
		ThirdLargestNum t= new ThirdLargestNum();
		t.thirdLargestElement(arr);
				

	}

}
