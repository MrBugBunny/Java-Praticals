package practice;

import java.util.Comparator;

public class Customer implements Comparable<Customer>
{
	int cid;
	String cname;
	int cage;
	
	public Customer(int id, String n, int a) 
	{
		cid=id;
		cname=n;
		cage=a;
	}
	/*public int compareTo(Customer c4)
	{
		//return c4.cid-this.cid;
		//return this.cname.compareTo(c4.cname);
		/*if(this.cage<c4.cage)
		{
			return -1;
		}
		else if(this.cage>c4.cage)
		{
			return 1;
		}
		else if(this.cage == c4.cage)
		{
			if(this.cid<c4.cid)
			{
				return 2;
			}
			else if(this.cid>c4.cid)
			{
				return-2;
			}
			else
			{
				return 1;
			}
		}return 0;
			
	}*/

		
			

	public String toString()
	{
		return "id: " +cid+ " Name: "+cname+ " Age : "+cage ;
	}
	
}





 