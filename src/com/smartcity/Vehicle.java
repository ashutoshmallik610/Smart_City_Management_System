package com.smartcity;

public class Vehicle 
{
	private String vehicleNumber;
	private String owner;
	private String vehicleType;
	
	public Vehicle(String vehicleNumber, String owner, String vehicleType) 
	{
		this.vehicleNumber = vehicleNumber;
		this.owner = owner;
		this.vehicleType = vehicleType;
	}
	public void registerVehicle()
	{
		System.out.println("Vehicle registered.");
	}
	public void displayVehicle()
	{
		System.out.println("Owner of the vehicle is : "+owner);
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Vehicle Type : "+vehicleType);
	}
	public void payRoadTax()
	{
		System.out.println(owner + " paid road tax");
	}
	public void updateOwner(String newOwner)
	{
	    this.owner = newOwner;
	    System.out.println("Owner updated successfully.");
	}


}
