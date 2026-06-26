package java_basics;
import java.util.*;
import java.io.*;

public class Loop8 {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<5;i++) {
			for(int j=65;j<=69-i;j++) {
			   System.out.print((char)j);
			}
			System.out.println();
		}
}
}
