package java_basics;

public class Array_19 {
	int num=345;
	int digit=0;
	int fact;
	int sum=0;
	
	public int strong(int num) {
		if(num<=0) {
			return sum;
		}
	
			fact=1;
		digit=num%10;
		for(int i=1;i<=digit;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		
	
		return strong(num);
	}

	public static void main(String[] args) {
		Array_19 a= new Array_19();
		  System.out.println(a.strong(0));

	}

}
