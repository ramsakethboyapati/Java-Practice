package java_basics;
import java.util.*;

public class Array_18 {

	public static void main(String[] args) {
		int arr[] = {1,2};

        Arrays.sort(arr);
        int count=1;
        int maxcount=1;
        int temp=0;
        for(int i=0;i<arr.length;i++) {
        	int candidate=arr[i];
        	count=1;
        for(int j=i+1;j<arr.length;j++) {
        	if(candidate==arr[j]) {
        		count++;
        	}	
        }
        if(count>arr.length/2) {
        	
        	System.out.println(count+" :"+candidate);
        	return;
        }
        
        }
        System.out.println("no majority");
	}

}
