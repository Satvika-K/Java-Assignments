package com.ass;
import java.util.Scanner;
public class StringEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String in=sc.nextLine();
		if(in.trim().isEmpty())
		{
			System.out.println("The String does not contain any words");
		}else
		{
			String[] words=in.trim().split("\\s+");
			int count=words.length;
			System.out.println("The number of words present in the string:"+count);
		}
	}
}
