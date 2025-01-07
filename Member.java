package com.ass;
class Member1 {
String name;
byte age;
long ph_no;
String addrs;
float salary;
    void printSalary()
    {
    	System.out.println("Salary:"+salary);
    }
    void display()
    {
    	System.out.println("Name:"+name);
    	System.out.println("Age:"+age);
    	System.out.println("Phone no:"+ph_no);
    	System.out.println("Address:"+addrs);
    	printSalary();
    }
}
class Employee extends Member1
{
	String specialization;
	void details()
	{
	System.out.println("Specialization:"+specialization);
	display();
	}
}
class Member extends Member1
{
	String department;
	void ManagerDetails()
	{
		System.out.println("Department:"+department);
		display();
	}
   public static void main(String[] args)
   {
	  Member obj=new Member();
	  obj.name="Satvika";
	  obj.age=22;
	  obj.ph_no=398748389;
	  obj.addrs="Bangalore";
	  obj.salary=25000;
	  obj.department="Pega";
	  obj.ManagerDetails();
	  Employee e1=new Employee();
	  e1.name="Reshma";
	  e1.age=22;
	  e1.ph_no=398748389;
	  e1.addrs="Hyderabad";
	  e1.salary=25000;
	  e1.specialization="Pega";
	  e1.details();
   }	
}
