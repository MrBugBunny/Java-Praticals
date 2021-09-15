package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CalTowDigitNumber 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(12);
		list.add(6);
		list.add(9123);
		Collections.sort(list);
		Iterator<Integer> itr = list.iterator();
		//int count=0;
		int twoDigitCount=0;
		while(itr.hasNext())
		{
			int count=0;
			
			Integer num = itr.next();
			System.out.println(num);
			/*Method 1
			 if(num>=100 && num <= 999)
			{
			    count++;
			}*/
			//method 2
			while(num!=0)
			{
				num/=10;
				++count;				
			}
			if(count==2)
			{
				twoDigitCount+=1;
			}
			
			
					
		}
		System.out.println("Number of 2 digit number:" +twoDigitCount);
		
	}
	
	
}
