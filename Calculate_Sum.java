package com.ass;
import java.util.Scanner;
public class Calculate_Sum {
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum +=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int result=Calculate_Sum.calculateSum(n);
        System.out.println("The sum of first"+" "+n+" "+"natural numbers divisible by 3 or 5 is"+" "+result);
	}
}
