package java_basics;
import java.util.*;

public class Arms {
	int digit=0;
	int product=1;
	int sum=0;
	public int armstrong(int n) {
		if(n!=0) {
		int digit=n%10;
		product=digit*digit*digit;
		sum=sum+product;
		armstrong(n/10);
		
		}
		else {
			return 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Arms a= new Arms();
		
		if(n==a.armstrong(n)) {
		System.out.println("Armstrong");
		}
		else {
			System.out.println("not a armstrong");
		}

	}

}
