package com.ass;

class Division
{
	int div(int a,int b)
	{
		int res=a/b;
		return res;
	}
}
class Multiplication extends Division
{
	int mul(int a,int b)
	{
		int result=a*b;
		return result; 
	}
}
public class Multi_Level extends Multiplication{
    void test()
    {
    	System.out.println("Multilevel Inheritance");
    }
	public static void main(String[] args) {
		Multi_Level obj=new Multi_Level();
		int x=obj.div(2,4);
		System.out.println(x);
		int y=obj.mul(5, 5);
        System.out.println(y);
        obj.test();
	}
}
