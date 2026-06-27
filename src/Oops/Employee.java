package Oops;

public class Employee {
	 int empno;
	float basicsalary;
	
	public Employee() {
		empno=123;
		basicsalary=1234.56f;
		System.out.println("Statements from constructor");
	}
	void calculateSalary() {
		System.out.println("The salary is "+basicsalary);
		
	}

}
