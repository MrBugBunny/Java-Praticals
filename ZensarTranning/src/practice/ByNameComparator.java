package practice;

import java.util.Comparator;

class ByNameComparator implements Comparator<Customer>
{
	public int compare(Customer o1, Customer o2)
	{
		return o1.cname.compareTo(o2.cname);
	}
}

class BySalarayComparator implements Comparator<Customer>
{
	public int compare(Customer o1,Customer o2)
	{
		return o2.cage-o1.cage;
				
	}
}