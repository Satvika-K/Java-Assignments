package com.ass;
import java.util.Scanner;
public class Smallest {
    public int smallOf3(int n1,int n2,int n3)
    {
    	if(n1<n2&&n1<n3)
    	{
    		return n1;
    	}
    	else if(n2<n1&&n2<n3)
    	{
    		return n2;
    	}
    	else
    	{
    		return n3;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int n3=sc.nextInt();
        Smallest s1=new Smallest();
        System.out.println("The smallest value is:"+s1.smallOf3(n1,n2,n3));
	}
}
