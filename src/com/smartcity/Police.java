package com.smartcity;

public class Police extends Employee
{
	public Police(String name, int age, 
			String gender, String address, String phone, String empId,
			String dept, int salary) 
	{
		super(name, age, gender, address, phone, empId, dept, salary);
	}

	public void catchCriminal()
	{
		this.controlTraffic();
		System.out.println("Police catches the criminals.");
	}
	
	public void controlTraffic()
	{
		System.out.println("Police controls Traffic.");
	}
	
	@Override
	public void generateReport()
	{
		super.display();
	}
}
