package com.shapes;
class Square{
	void area(int a)
	{
		int res=a*a;
		System.out.println(res);
	}
}
class Triangle{
	int area(int b,int h)
	{
		int res=(b*h)/2;
		return res;
	}
}
class Circle{
	void area(int r)
	{
		final double pi=3.14;
		double res=pi*r*r;
		System.out.println(res);
	}
}
public class TestShapes {
	public static void main(String[] args) {
		Square s1=new Square();
		s1.area(4);
		Triangle t1=new Triangle();
		System.out.println(t1.area(4,13));
		Circle c1=new Circle();
		c1.area(5);
	}
}
