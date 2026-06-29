package Dsa;

public class Element_InsertionArray {
	public void insert(int arr[],int position,int element) {
		int arrNew[]=new int[arr.length+1];
		for(int i=0;i<position;i++) {
			arrNew[i]=arr[i];
			
		}
		arrNew[position]=88;
		for(int j=position+1;j<arrNew.length;j++) {
			arrNew[j]=arr[j-1];
		}
		for(int x:arrNew) {
			System.out.print(x+" ");
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {1,8,3,9,2,47};
		int position=3;
		int element=88;
		Element_InsertionArray e=new Element_InsertionArray();
		e.insert(arr,position,element);
		
	}

}
