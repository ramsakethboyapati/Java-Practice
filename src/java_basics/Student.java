package java_basics;
//WAP stuid,stuname,studept,create the static variable studept,
//read the variable using setter methods
public class Student {
	int stuId;
	public int getStuId() {
		return stuId;
	}


	public
	void setStuId(int stuId) {
		this.stuId = stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	String stuName;
	 static String stuDept;
	 
	public static void main(String[] args) {
		stuDept="cse";
		Student s=new Student();
		s.setStuId(101);
		s.setStuName("saketh");
		System.out.println(s.getStuId());
		System.out.println(s.getStuName());
		System.out.println(Student.stuDept);
		

	}

}
