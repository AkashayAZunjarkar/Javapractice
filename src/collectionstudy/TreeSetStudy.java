package collectionstudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	{
	//TreeSet<Object>ts=new TreeSet<>();
	//	ts.add("Nashik");
	//	ts.add(123);----------//ClassCastException
	//	ts.add(null);-------------//NullPointer Exception
	//	ts.add("Amravati");
	//	ts.add("lahor");
	//.add("Mumbai");
	//	System.out.println(ts);
		
		TreeSet<Integer>ts1=new TreeSet<>();
		ts1.add(10);
	//	ts1.add(3);
		ts1.add(5);
		ts1.add(7);
	//	ts1.add(1);
		ts1.add(8);
	//	ts1.add(2);
		ts1.add(9);
		ts1.add(6);
		ts1.add(12);
		System.out.println(ts1);
		
		System.out.println(ts1.ceiling(3));
		System.out.println(ts1.ceiling(7));
		
		System.out.println(ts1.floor(2));
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println(ts1.remove(4));
		System.out.println(ts1.higher(6));
		System.out.println(ts1.lower(8));
		
		System.out.println("____________________for each----------------------");
		
		//for each;iterator
		
		for(Integer th:ts1)
		{
			System.out.println(th);
		}
		
		System.out.println("____________________iterator---------------------");
		
		Iterator<Integer> t1 = ts1.iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		
		System.out.println("____________________decending iterator---------------------");
		
		Iterator<Integer> t2 = ts1.descendingIterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}

	}

}
