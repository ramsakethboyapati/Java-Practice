package java_basics;
import java.util.Scanner;

public class Array_1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[10];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        int large=0;
        int second_large=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>large) {                      
        		second_large=large;                  
        		large=arr[i];
        		
        	}
        	else if(arr[i]>second_large && arr[i]!=large){
        		second_large=arr[i];
        	}
        	
        }
        System.out.println(second_large);
        
    }     
}