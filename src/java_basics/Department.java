package java_basics;

public class Department extends Employee1 {
	public Department(int empno,float empsal) {
		this.empno=empno;
		this.empsal=empsal;
	}
	public void calculateSalary() {
		if(empsal>100000) {
			System.out.println("general manager");
		}
		else if(empsal>50000 && empsal<100000) {
			System.out.println("manager");
		}
		else {
			System.out.println("Asistant manager");
		}
	}

	public static void main(String[] args) {
		Department d= new Department(121,60000);
		d.calculateSalary();

	}

}
