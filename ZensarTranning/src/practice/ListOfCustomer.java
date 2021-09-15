package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ListOfCustomer 
{
	public void display(ArrayList<Customer>c)
	{
		//method 1-for loop
		/*System.out.println("using for loop....");
		for(int i=0;i<c.size();i++)
		{
		Customer c1= c.get(i);
		System.out.println(c1);
		}
		//method 2-for each
		System.out.println("using for each ....");
		for(Customer c1 :c)
		{
			System.out.println(c1);
		}*/
		//method 3-Iterator
		System.out.println("using Iterator ....");
		Iterator<Customer> itr = c.iterator();
		
		while(itr.hasNext())
		{
		Customer c2 = itr.next();
		System.out.println(c2);
		}
		Collections.sort(c);
		System.out.println("using Iterator after sorting ....");
		itr = c.iterator();
		
		while(itr.hasNext())
		{
		Customer c2 = itr.next();
		System.out.println(c2);
		}
		
		//method 3-ListIterator
		/*System.out.println("using ListIterator ....");
		ListIterator<Customer> litr = c.listIterator(c.size());
		Collections.sort();
		
		while(litr.hasPrevious())
		{
			Customer c3 =litr.previous();
			System.out.println(c3);
		}*/
		
		
}
	public static void main(String[] args)
	{
		ArrayList<Customer> clist =new ArrayList<>();
		clist.add(new Customer(15,"ASD",22));
		clist.add(new Customer(32,"QWE",22));
		clist.add(new Customer(45,"RTY",41));
		clist.add(new Customer(1,"UIO",60));
		clist.add(new Customer(6,"PLK",39));
		ListOfCustomer c = new ListOfCustomer();
		c.display(clist);
		
	}
}
