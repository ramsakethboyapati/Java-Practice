//WAP to check the repeated numbers in a given list of values 
package java_basics;
import java.util.*;

public class Array_10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int [10];
		int count=1;
		
        	for(int j=0;j<arr.length;j++) {
        		arr[j]=sc.nextInt();
        }
		for(int i=0;i<arr.length;i++) {
			boolean visited = false;

            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if(visited)
                continue;

			count=1;
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			count++;
        		}

        	}
        	if(count>1) {
    			System.out.println(arr[i]+":"+count);
    		}
        	
        }

	}

}
