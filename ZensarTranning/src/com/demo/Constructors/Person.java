package com.demo.Constructors;

public class Person {
	 public  String personName;
	 public String personId;
	 //public String city="sangli";
	 
	public Person(String personName, String personId) {
		
		this.personName = personName;
		this.personId = personId;
	}
	 
	public void disply() {
		System.out.println("PersonId: "+ personId);
		System.out.println("PersonName : "+personName );
	}
	 
	}

