package java_basics;
import java.util.*;

public class Loop7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String userName=sc.next();
			String password=sc.next();
			if(userName.equals("saketh@gmail.com") && password.equals("saketh")) {
				System.out.println("login succcessful");
				return;
			}
			else {
				System.out.println("wrong password/id");
			}
		}

	}

}
