package java_basics;
//emp,dev,test

class Employeee{
	private int empid;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	private String empname;
	private double empsal;
	
	public Employeee(int empid,String empname,double empsal) {
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		
	}
	public void displayDetails() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
	}
}
class Developer extends Employeee{
	public int projectBonus;
	
	public Developer(int empid,String empname,double empsal,int projectBonus) {
		super(empid,empname,empsal);
		this.projectBonus=projectBonus;
		
	}
	public double calculateSalary() {
		return getEmpsal()+projectBonus;
	}
	public void displayDeveloper() {
		System.out.println("======================display developer=============");
		displayDetails();
		System.out.println("project bonus is :"+projectBonus);
        System.out.println("total salary is :"+calculateSalary());
	}
	
}
class Tester extends Employeee{
	public int bugBonus;
	
	public Tester(int empid,String empname,double empsalary,int bugBonus) {
		super(empid,empname,empsalary);
		this.bugBonus=bugBonus;
		
	}
	public void displayTester() {
		System.out.println("=========================Tester details=============");
		displayDetails();
		System.out.println(bugBonus);
	}
}

public class MainDemo {

	public static void main(String[] args) {
		Developer d= new Developer(123,"saketh",100000.34,12434);
		d.displayDeveloper();
		Tester t= new Tester(124,"ram",100000.47,12223);
		t.displayTester();
		

	}

}
