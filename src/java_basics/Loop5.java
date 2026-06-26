package java_basics;
import java.util.*;

public class Loop5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("hello");
	}

}
