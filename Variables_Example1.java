package com.ass;
import java.util.Scanner;
public class Variables_Example1 {

	public static void main(String[] args) {
        int number1,number2,number3,result,average,sub_result,mul_result;
        Scanner sc=new Scanner(System.in);
        System.out.println("number1=");
        number1=sc.nextInt();
        System.out.println("number2=");
        number2=sc.nextInt();
        System.out.println("number3=");
        number3=sc.nextInt();
        result=number1+number2+number3;
        average=(result/3);
        sub_result=number1-number2-number3;
        mul_result=number1*number2*number3;
        System.out.println("sum of three numbers is :"+result);
        System.out.println("average of three numbers is :"+average);
        System.out.println("sub of three numbers is :"+sub_result);
        System.out.println("multiplication of three numbers is :"+mul_result);
	}
}
