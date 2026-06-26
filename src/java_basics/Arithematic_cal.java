package java_basics;

public class Arithematic_cal {
	private int len;
	public Arithematic_cal(int len, float bre) {
		super();
		this.len = len;
		this.bre = bre;
	}

	public Arithematic_cal(float bre) {
		super();
		this.bre = bre;
	}
	
	private float bre;
	
	public Arithematic_cal(int len) {
		super();
		this.len = len;
	}




	public static void main(String[] args) {
		Arithematic_cal a= new Arithematic_cal(7.73f);
		

	}

}
