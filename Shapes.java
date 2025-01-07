package com.ass;
class Shape
{
	void area(int a)
	{
		int res=a*a;
		System.out.println("Area of Square:"+res);
	}
	void perimeter(int a)
	{
		int res=4*a;
		System.out.println("Perimeter of Square:"+res);
	}
	void area(int length,int width)
	{
		int res=length*width;
		System.out.println("Area of Rectangle:"+res);
	}
	void perimeter(int length,int width)
	{
		int res=(length+width)*2;
		System.out.println("Perimeter of Rectangle:"+res);
	}
}
public class Shapes {
	public static void main(String[] args) {
		Shape obj=new Shape();
		obj.area(4);
		obj.area(6,3);
		obj.perimeter(4);
		obj.perimeter(6,3);
	}
}
