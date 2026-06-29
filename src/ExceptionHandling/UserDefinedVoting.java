package ExceptionHandling;

public class UserDefinedVoting {
	public void vote() {
		int age=13;
		if(age<13) {
			System.out.println("vote");
		}
		else {
			throw new NotEligibleToVote("not eligible");
		}
	}

}
