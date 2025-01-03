package com.ass;
import java.util.Scanner;
public class Average {
	public void avg(int n1,int n2,int n3)
	{
		int result=(n1+n2+n3)/3;
		System.out.println("The average value is:"+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int n3=sc.nextInt();
		Average av=new Average();
		av.avg(n1,n2,n3);
	}
}
