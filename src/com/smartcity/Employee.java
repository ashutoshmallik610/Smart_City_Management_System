package com.smartcity;

public abstract class Employee extends Citizen implements Reportable
{
	private String empId;
	private String dept;
	private int salary;
	
	public Employee(String name, int age, String gender, 
			String address, String phone, String empId,
			String dept, int salary) 
	{
		super(name, age, gender, address, phone);
		this.empId = empId;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getEmpId() {
		return empId;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("\n--------Employee--------\n");
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Department : "+getDept());
		System.out.println("Salary : "+getSalary());
	}
}
