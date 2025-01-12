package com.ass;
import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
        String in=sc.nextLine();
        StringBuilder capital=new StringBuilder();
        for(int i=0;i<in.length();i++)
        {
        	char ch=in.charAt(i);
        	if(Character.isUpperCase(ch))
        	{
        		capital.append(ch);
        	}
        }
        if(capital.length()>0)
        {
        	System.out.println("Capital letters in the string "+capital);
        }else
        {
        	System.out.println("No capital letters in the string");
        }
	}

}
