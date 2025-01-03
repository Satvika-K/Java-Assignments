package com.ass;
import java.util.Scanner;
public class Operations {
	public static void operator(int n1,int n2)
	{
		System.out.println("sum:"+(n1+n2));
		System.out.println("mul:"+(n1*n2));
		System.out.println("sub:"+(n1-n2));
		System.out.println("div:"+(n1/n2));
		System.out.println("mod:"+(n1%n2));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st num:");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd num:");
		int n2=sc.nextInt();
		Operations.operator(n1, n2);
	}
}
