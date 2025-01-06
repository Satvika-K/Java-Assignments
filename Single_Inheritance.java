package com.ass;

class Addition 
{
	void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Sum of two:"+res);
	}
}
public class Single_Inheritance extends Addition{
	void sub(int a,int b)
	{
		int res=a-b;
		System.out.println("Difference of two:"+res);
	}
	public static void main(String[] args) {
		Single_Inheritance obj=new Single_Inheritance();
		obj.add(2, 5);
		obj.sub(10, 5);
	}
}
