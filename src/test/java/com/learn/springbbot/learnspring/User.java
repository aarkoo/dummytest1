package com.learn.springbbot.learnspring;

public class User {
	
	private Address address;
	private Salary salary;
	
	public User(Address address,Salary salary)
	{
		this.address=address;
		this.salary=salary;
		
	}
	
	public void printdetails()
	{
		System.out.println(this.address.getStreet());
		System.out.println(this.salary.getAmount());
	}

}
