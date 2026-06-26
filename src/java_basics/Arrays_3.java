//WAP to print prime numbers in a array
package java_basics;
import java.util.Scanner;

public class Arrays_3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[10];
        boolean isPrime=true;
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++) {
        	isPrime=true;
        	for(int k=2;k<arr[j];k++) {
        		if(arr[j]%k==0 || arr[j]==1) {
        			isPrime=false;
        		}
        	}
        	if(isPrime==true) {
        		System.out.print(arr[j]+" ");
        	}
        }
        
        
        
    }     
}