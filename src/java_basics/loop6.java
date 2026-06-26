package java_basics;
import java.util.*;

public class loop6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=10;
		while(i<=100) {
			if(i%2!=0){
				i++;
				continue;
				
			}
			System.out.println(i);
			
			i++;
		}

	}

}
