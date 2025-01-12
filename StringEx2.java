package com.ass;
import java.util.Scanner;
public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string:");
		String first=sc.nextLine();
		System.out.println("Enter the 2nd string:");
		String second=sc.nextLine();
		if(first.endsWith(second))
		{
			System.out.println("The String "+first+" ends with "+second);
		}else
		{
			System.out.println("The String "+first+" does not end with "+second);
		}
	}
}
