package com.smartcity;

public class Teacher extends Employee
{

	public Teacher(String name, int age, 
			String gender, String address, String phone, String empId,
			String dept, int salary) 
	{
		super(name, age, gender, address, phone, empId, dept, salary);
	}
	
	public void teach()
	{
		this.conductExam();
		System.out.println("Teachers teaches students.");
	}
	public void conductExam()
	{
		System.out.println("Teachers conducts exam");
	}

	@Override
	public void generateReport() {
		
		super.display();
		
	}

}
