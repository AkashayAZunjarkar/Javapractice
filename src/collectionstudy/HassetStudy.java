package collectionstudy;

import java.util.HashSet;
import java.util.Iterator;

public class HassetStudy {

	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<>();
		hs.add(23);
		hs.add(14);
		hs.add(55);
		hs.add(99);
		hs.add(99);
		hs.add(3);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<>();
		hs1.add("AZ");
		hs1.add("LA");
		hs1.add("MZ");
		hs1.add(null);
		hs1.add("AZ");
		hs1.add("CAT");
		System.out.println(hs1);
		
		//for each/itterator
		System.out.println("=======================for each====================");
		
		for(String h:hs1)
		{
			System.out.println(h);
			
		}
		
		System.out.println("=======================iterator====================");
		
		Iterator<String> it = hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
