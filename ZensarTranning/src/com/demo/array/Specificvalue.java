package com.demo.array;

import java.util.*;

public class Specificvalue 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		System.out.println("Enter the array value to be searched : ");
		int value=sc.nextInt();
	for(int i=0;i<=size;i++)
	{
		if( value == a[i] )
		{
		System.out.println(value+" Value is present in array");
		}
		
	}

	}
	}
		

