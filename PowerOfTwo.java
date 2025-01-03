package com.ass;
import java.util.Scanner;
public class PowerOfTwo {
    public static boolean checkNumber(int n)
    {
    	if(n<=0)
    	{
    		return false;
    	}
    	while(n>1)
    	{
    		if(n%2!=0)
    		{
    			return false;
    		}
    		n=n/2;
    	}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean result=PowerOfTwo.checkNumber(n);
		if(result==true)
		{
			System.out.println(+n+" "+"is the power of 2");
		}else
        System.out.println(+n+" "+"is not power of 2");
}
}
