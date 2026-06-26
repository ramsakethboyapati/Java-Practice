package java_basics;

import java.io.*;
import java.util.*;

public class Loop9 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int count=1;
        while(sc.hasNext()){
            String line=sc.nextLine();
            System.out.println(count+" "+line);
            count++;
        }
        
    }
}
