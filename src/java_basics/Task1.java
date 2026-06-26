package java_basics;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int empno=sc.nextInt();
		double emp_salary=sc.nextInt();
		
		System.out.println("empno: "+empno);
		double net=0;
		
		if(emp_salary>50000) {
			
			System.out.println("ta: "+0.20*emp_salary);
			System.out.println("da: "+0.15*emp_salary);
			System.out.println("pf: "+0.10*emp_salary);
			net=(emp_salary+0.20*emp_salary+0.15*emp_salary-0.10*emp_salary);
			System.out.println("net: "+net);
			
		}
		
		
		else if(emp_salary<50000 && emp_salary>20000 ) {
			System.out.println("ta: "+0.15*emp_salary);
			System.out.println("da: "+0.10*emp_salary);
			System.out.println("pf: "+0.05*emp_salary);
			net=(emp_salary+0.15*emp_salary+0.10*emp_salary-0.05*emp_salary);
			System.out.println("net: "+net);
			
		}
		else if(emp_salary<20000 && emp_salary>10000 ) {
			System.out.println("ta: "+0.10*emp_salary);
			System.out.println("da: "+0.05*emp_salary);
			System.out.println("pf: "+0.025*emp_salary);
			net=(emp_salary+0.10*emp_salary+0.05*emp_salary-0.025*emp_salary);
			System.out.println("net: "+net);
			
		}
		else if(emp_salary<10000) {
			System.out.println("ta: "+0.05*emp_salary);
			System.out.println("da: "+0.025*emp_salary);
			System.out.println("pf: "+0.025*emp_salary);
			net=(emp_salary+0.05*emp_salary+0.025*emp_salary-0.025*emp_salary);
			System.out.println("net: "+net);
			
		}
		
		
		

	}

}
