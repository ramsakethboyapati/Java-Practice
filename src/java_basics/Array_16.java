package java_basics;
import java.util.*;

public class Array_16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		arr[0]=1;
		int count=1;
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i-1]+count;
			count=count+2;
			
		}
		for(int x:arr) {
			System.out.print(x+",");
		}

	}

}
