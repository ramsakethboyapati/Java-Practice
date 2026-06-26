package java_basics;
import java.util.*;

public class Prime_num {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int starting=sc.nextInt();
		int ending =sc.nextInt();
		for(int i = starting; i <= ending; i++) {

		    int isPrime = 0;
		    for(int j=2;j<=i/2;j++) {
		        if(i % j == 0) {
		            isPrime = 1;
		            break;
		        }
		    }

		    if(isPrime == 0 && i > 1) {
		        System.out.print(i + " ");
		    }
		}
	}

}
