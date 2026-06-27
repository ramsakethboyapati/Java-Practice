package Oops;

public class ExcepClass {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("statements from finally Block");
		}

	}

}
