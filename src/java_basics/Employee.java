package java_basics;

public class Employee {
	int empid;
	public double getEmpsal() {
		return empsal;
	}



	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}



	double empsal;
	public void displayPosition() {
		if (empsal>100000) {
			System.out.println("manager");
		}
		else if(empsal>50000 && empsal<100000) {
			System.out.println("general manager");
		}
		else if(empsal<50000) {
			System.out.println("assistent manager");
		}
	}
	
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empid=101;
		e1.setEmpsal(56098);
		e1.displayPosition();

	}

}
