package Inheritance;

public class GeneralManager extends Employee {
	private int perks;
	public GeneralManager() {
		perks=1000;
	}
	@Override
	void calculateSalary() {
		Employee e=new Employee();
		e.calculateSalary();
		System.out.println(basicsalary+perks);
	}

}
