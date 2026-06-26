package java_basics;
import java.util.*;

public class Fact {

	public int fact(int n) {
		if(n<=1) {
			return 1;
		}
		
		n=n*fact(n-1);
		
		return n;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Fact f=new Fact();
		System.out.println(f.fact(n));

	}

}
