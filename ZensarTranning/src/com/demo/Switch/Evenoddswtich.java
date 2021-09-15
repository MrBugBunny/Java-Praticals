package com.demo.Switch;
import java.util.*;
public class Evenoddswtich 
{
	public static void main(String args[])
	{
		int number;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter tthe number--> ");
		number =num.nextInt();
		switch(number%2)
		{
		case 0 :
			System.out.println(number+" is a EVEN nummber");
			break;
		case 1 :
		System.out.println(number+" is a ODD nummber");
		break;
		}
	}
}
