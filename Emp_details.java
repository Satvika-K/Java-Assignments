package com.ass;
import java.util.Scanner;
public class Emp_details {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Employee ID:");
	int e_ID=sc.nextInt();
	System.out.println("Employee name:");
	String e_name=sc.next();
	System.out.println("Employee salary:");
	Double e_sal=sc.nextDouble();
	System.out.println("Employee address:");
	String e_add=sc.next();
	System.out.println("Employee gender:");
	char e_gender=sc.next().charAt(0);
	System.out.println("Employee mail:");
	String e_mail=sc.next();
    System.out.println("Employee ID:"+e_ID+"\n"+"Employee name:"+e_name+"\n"+"Employee salary:"+e_sal+"\n"+"Employee address:"+e_add+"\n"+"Employee gender:"+e_gender+"\n"+"Employee mail:"+e_mail);
	}
}
