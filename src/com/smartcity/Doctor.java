package com.smartcity;

public class Doctor extends Employee
{

	public Doctor(String name, int age, 
			String gender, String address, String phone, String empId,
			String dept, int salary) 
	{
		super(name, age, gender, address, phone, empId, dept, salary);
	}
	
	public void diagnose()
	{
		System.out.println("Diagnosis doing Diagnostic testing, blood testing ");
	}
	public void prescribeMedicine()
	{
		System.out.println("Diagnosis gives prescribtion");
	}

	@Override
	public void generateReport() {
		
		super.display();
	}
	
}
