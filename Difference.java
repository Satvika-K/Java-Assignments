package com.ass;
import java.util.Scanner;
public class Difference {
	public static int calculateDifference(int n)
	{
		int sum1=0;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum1+=i*i;
			sum+=i;
		}
		int square=sum*sum;
		return sum1-square;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int res=Difference.calculateDifference(n);
	System.out.println("Difference:"+res);
	}
}
