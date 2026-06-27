package Oops;

interface left{
	default void m1() {
		System.out.println("left default method");
	}
}
interface right{
	default void m1() {
		System.out.println("right default method");
	}
}


public class Hii implements right,left {
	@Override
	public void m1() {
		left.super.m1();
	}
	//without overriding cant use default methods of 
	//interface if we have same same method in both the interface

	public static void main(String[] args) {
		Hii i=new Hii();
		i.m1();

	}

}
