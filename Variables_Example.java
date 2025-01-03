package com.ass;
import java.util.Scanner;

public class Variables_Example {

	public static void main(String[] args) {
       byte number1,number2;
       Scanner sc=new Scanner(System.in);
       System.out.println("number1=");
       number1 = sc.nextByte();
       System.out.println("number2=");
       number2 = sc.nextByte();
       if(number1==number2)
       {
    	   System.out.println("number1 and number2 values are equal");
       }
       else
       {
    	   System.out.println("number1 and number2 values are not equal");
       }
	}
}
