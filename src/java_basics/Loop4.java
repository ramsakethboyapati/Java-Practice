package java_basics;
import java.util.*;

public class Loop4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userName=sc.next();
		String password=sc.next();
		if(userName=="saketh@gmail.com" && password=="Saketh") {
			System.out.println("logging into your account");
		}
		else {
			System.out.println("invalid credentials");
		}
	}

}
