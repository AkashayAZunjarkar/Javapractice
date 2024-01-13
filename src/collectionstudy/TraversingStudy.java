package collectionstudy;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingStudy {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(3);
		al.add(16);
		al.add(30);
		al.add(22);
		al.add(45);
		
		System.out.println(al);
		System.out.println("===================for loop====================");
		
		for(int i=0; i<=al.size()-1;i++)
			System.out.println(al.get(i));
		
		System.out.println("===================for each loop====================");
		
		
		for(Object b:al)
			System.out.println(b);
		
		System.out.println("===================Iterator====================");
		
		
		Iterator<Integer> az = al.iterator();
		
		System.out.println(az.next());
		
		System.out.println("===================List Iterator====================");
		
		Iterator<Integer> bl = al.iterator();
		while(bl.hasNext())
		{
			System.out.println(bl.next());
		}
		
	
		
		System.out.println("===================Using List Iterator in reverse direction====================");
		
		
		
		

		
		

	}

}
