package java_basics;

import java.util.Scanner;

public class Arm {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start=sc.nextInt();
        int end =sc.nextInt();
        int sum,prod,temp;

        for(int i=start;i<=end;i++) {
            temp=i;
            sum=0;
            prod=1;

            for(;temp!=0;) {
                int digit=temp%10;
                prod=digit*digit*digit;
                sum=sum+prod;
                temp=temp/10;
            }

            if(sum==i) {
                System.out.println(i);
            }
        }
    }
}