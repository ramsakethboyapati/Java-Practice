package ExceptionHandling;

public class UserDefinedException {
	
	UserDefinedException(){
		System.out.println("statements from user defined exception");
	}
	public void checkStatus() {
		int deposit=10000;
		int withdraw=2000000;
		if(deposit>withdraw) {
			int balance=deposit-withdraw;
		}
		else {
		
				
			throw new InsufficientFundsException("funds are not available");
			
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
