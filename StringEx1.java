package com.ass;
import java.util.Scanner;
public class StringEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String in=sc.nextLine();
		System.out.println("Enter the Index:");
		int index=sc.nextInt();
		if(index>=0 && index<in.length())
		{
			char character=in.charAt(index);
			System.out.println("The character at index "+index+" is:"+character);
		}else
		{
			System.out.println("Please enter the valid index 0 to"+(in.length()-1));
		}
	}
}
