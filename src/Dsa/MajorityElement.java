package Dsa;

public class MajorityElement {
	
	public void majority(int arr[],int majoritySize) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			count=0;
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
		System.out.println("No majority element");
		
	}

	public static void main(String[] args) {
		int arr[]= {1,3,9,9,47,9,9,9};
		int majoritySize=arr.length/2;
		MajorityElement r= new MajorityElement();
		r.majority(arr,majoritySize);
		
		
		

	}

}
