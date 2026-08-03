package com.smartcity;

import java.util.Scanner;
public class Citizen implements IPayble, IIdentifiable
{
	private String citizenId;
	private String name;
	private int age;
	private String gender;
	private String address;
	private String phone;
	
	public Citizen(String name, int age, String gender,
			String address, String phone) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}

	static String tempId;
	static int count;
	
	static
	{
		tempId="CITIZEN";
		count=100;
	}
	
	{
		citizenId=tempId+count;
		count++;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	
	public void display()
	{
		System.out.println("Citizen Id : "+citizenId);
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Gender : "+getGender());
		System.out.println("Address : "+getAddress());
		System.out.println("Phone Number : "+getPhone());
	}

	@Override
	public void verifyIdentify() 
	{	
		
	}

	@Override
	public void payBill(double amount) 
	{
		System.out.println(name+" paid bill - amount : "+amount);
		
	}

	@Override
	public void payTax() {
		
		System.out.println(name+" paid tax ");
		
	}
	
}
