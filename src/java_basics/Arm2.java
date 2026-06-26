package java_basics;
import java.util.*;
public class Arm2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arm=n;
		int sum=0;
		while(n>0) {
			int product=1;
			int digit=n%10;
			product=digit*digit*digit;
			sum=sum+product;
			n=n/10;
			if(n!=0) {
				continue;
			}
			
		}
		if(sum==arm) {
			System.out.println("armstrong");
		}
		else {
			System.out.println();
		}

	}

}
