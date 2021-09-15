package com.demo.classandobjects;

public class Account 
{
	String accno,accname;
	int amount;
	void insert(String s1,String s2,int a)
	{
		accno=s1;
		accname=s2;
		amount=a;
	}
	void display()
	{
		System.out.println("Account holder Name:"+accname);
		System.out.println("Account Number:"+accno);
		System.out.println("Account Balance:"+amount);
	}
	void withdraw(int wamount)
	{
		if(amount>=wamount)
		{
			amount=amount -wamount;
		}
	}
	void check_balance()
	{
		System.out.println("Remaining Balance:"+amount);
	}
	public static void main(String[] args) 
	{
		Account a=new Account();
		a.insert("AJ125646", "Pranav", 25000);
		a.display();
		a.withdraw(11000);
		a.check_balance();
	}

}