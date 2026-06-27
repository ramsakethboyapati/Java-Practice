package Oops;

public class ObjectDemo {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer();
		str1.append("ComputerScience123");
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		str1.trimToSize();
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		str1.setLength(21);
		System.out.println(str1);
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		System.out.println(str1.substring(3,10));
		System.out.println(str1.delete(3, 7));
		StringBuffer str2=new StringBuffer("hello");
		System.out.println(str1.compareTo(str2));
		
		

	}

}
