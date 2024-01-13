package collectionstudy;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMethod {

	public static void main(String[] args) 
	{
		Vector<String> v =new Vector<>();
		
		v.add("AZ");
		v.add("HP");
		v.add("PB");
		v.add("KA");
		v.add("MK");
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		v.add("BL");
		v.add("SW");
		v.add(null);
		v.add(null);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		System.out.println(v);
		
		System.out.println(v.contains("AZ"));
		System.out.println(v.get(1));
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		v.insertElementAt("AA", 1);// working a add(index,element)
		System.out.println(v);
		
		v.setSize(25);
		System.out.println(v);
		
		System.out.println(v.remove(1));
		System.out.println(v.remove("HP"));
		
		System.out.println("==================enumeration========================");
		
	Enumeration<String> v1 = v.elements();
	while(v1.hasMoreElements())
	{
		System.out.println(v1.nextElement());
	}
	}
}
		



