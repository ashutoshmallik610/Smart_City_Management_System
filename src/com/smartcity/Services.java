package com.smartcity;

public class Services 
{
	private String serviceName;
	
	
	public void applyService()
	{
		System.out.println("Successfully applied for "+serviceName);
	}
	public void approveService()
	{
		System.out.println("Your request approved for "+serviceName);
	}
	public void rejectService()
	{
		System.out.println("Your request rejested for "+serviceName);
	}
	public void updateServiceName(String newServiceName)
	{
	    this.serviceName = newServiceName;
	    System.out.println("Service name updated successfully.");
	}
}
