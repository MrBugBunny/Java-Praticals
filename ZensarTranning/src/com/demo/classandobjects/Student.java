package com.demo.classandobjects;

public class Student 
{
	private int rollno;
	protected int addmissionno;
	int age;
	public int courseId;
	
	public void doPublic()
	{
		System.out.println("doPublic method");
	}
	void doDefault()
	{
		System.out.println("doDefault method");
	}
	protected void doProtected()
	{
		System.out.println("doProtected method");
	}
	private void doPrivate()
	{
		System.out.println("doPrivate method");
	}
}
