package java_basics;

public class Task2 {
	
	int num1;
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	int num2;
	
	public void display() {
		System.out.println(num1);
		System.out.println(num2);
	}

	public static void main(String[] args) {
		Task2 t= new Task2();
		t.setNum1(10);
		System.out.println(t.getNum1());
		t.display();

	}

}
