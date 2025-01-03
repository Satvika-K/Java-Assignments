package com.ass;
import java.util.Scanner;
public class Demo {
    public static boolean checkNum(int num)
    {
    	int prevDigit=10;
    	while(num>0)
    	{
    		int curDigit=num%10;
    		if(curDigit>prevDigit)
    		{
    			return false;
    		}
    	prevDigit=curDigit;
    	num=num/10;
    	}
    return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean res=Demo.checkNum(num);
		if(res==true)
		{
        System.out.println(+num+" "+"is an increasing number");
		}else
        System.out.println(+num+" "+"is not an increasing number");
	}
}
