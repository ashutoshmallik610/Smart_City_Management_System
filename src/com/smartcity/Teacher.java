package com.smartcity;

public class Teacher extends Employee
{
	private String subject;
	private String schoolName;
	
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
	public void updateSubject(String newSubject)
	{
	    this.subject = newSubject;
	    System.out.println("Subject updated successfully.");
	}

	public void updateSchool(String newSchool)
	{
	    this.schoolName = newSchool;
	    System.out.println("School updated successfully.");
	}
	
	@Override
	public void generateReport() {
		
		super.display();
		
	}

}
