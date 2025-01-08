package com.ass;
import java.util.Scanner;
class InvalidAge extends Exception
{
	public InvalidAge(String message)
	{
		super(message);
		
	}
}
public class PersonAge {
	public static void main(String[] args) throws InvalidAge {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age>15)
		{
			System.out.println("The age of the person is:"+age);
		}
		else
		{
			throw new InvalidAge("Please enter the valid age");
		}
	}
}
