package Dsa;

public class RemoveDuplicate {
	
	public void majority(int arr[],int majoritySize) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean visited=false;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					visited=true;
					break;
				}
			}
			if(visited==false) {
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>majoritySize) {
				System.out.println(arr[i]+" is major element");
				return;
			}
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,3,3,9,0,47,3,3,3};
		int majoritySize=arr.length/2;
		RemoveDuplicate r= new RemoveDuplicate();
		r.majority(arr,majoritySize);
		
		
		

	}

}
