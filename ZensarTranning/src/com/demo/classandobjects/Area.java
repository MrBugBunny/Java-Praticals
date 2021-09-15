package com.demo.classandobjects;

public class Area 
{
	void area(float r)
	{
		System.out.println("Area Of Circle:"+3.14f*r*r);
	}
	void area(int s)
	{
		System.out.println("Area of a square:"+s*s);
	}
	void area(int l,int w)
	{
	    System.out.println("Area of a rectangle"+l*w);
	}
	public static void main(String[] args) 
	{
		Area a=new Area();
		a.area(5.2f);
		a.area(7);
		a.area(12,8);
	}

}
