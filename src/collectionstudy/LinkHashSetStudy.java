package collectionstudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
		hs.add(30);
		hs.add(null);
		hs.add(30);
		hs.add(45);
		hs.add(null);
		hs.add(20);
		System.out.println(hs);
		
		System.out.println("=====================for each=====================");
		
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		
		System.out.println("=====================iterator=====================");
		
        Iterator<Object> hs1 = hs.iterator();
        while(hs1.hasNext())
        {
        	System.out.println(hs1.next());
        }
		
	
	}

}
